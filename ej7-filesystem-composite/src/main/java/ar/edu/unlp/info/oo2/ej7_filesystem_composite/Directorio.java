package ar.edu.unlp.info.oo2.ej7_filesystem_composite;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Directorio extends FileSystem {
	
	private List<FileSystem> elementos;
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
		this.elementos = new ArrayList<>();
	}
	
	public void agregar(FileSystem elemento) {
		this.elementos.add(elemento);
	}
	
	public int tamanioTotalOcupado() {
		return 32 + this.elementos.stream().mapToInt(e -> e.tamanioTotalOcupado()).sum();
	}
	
	public Archivo archivoMasGrande() {
		//return this.elementos.stream().max((a1, a2)-> Int.compare(a1.tamanioTotalOcupado(), a2.tamanioTotalOcupado())).orElse(null); -> no estaba buscando recursivamente entro los directorios
		return this.elementos.stream().map(e -> e.archivoMasGrande()).max((a1, a2)-> Integer.compare(a1.tamanioTotalOcupado(), a2.tamanioTotalOcupado())).orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return this.elementos.stream().map(e -> e.archivoMasNuevo()).max((a1, a2)->a1.getFecha().compareTo(a2.getFecha())).orElse(null);
	}
	
	
	
	public FileSystem buscar(String nombre){
		if (this.getNombre().equals(nombre) ) //esto hace que pueda devolver los directorios
			return this;
		else
			return this.elementos.stream()
				.map(e -> e.buscar(nombre))//primero asegurarme de tener un archivo
				.filter(e -> e!=null)//despues me fijo que coincida
				.findFirst().orElse(null); //si no pongo el filter va a mandar el 1er optional aunque esté vacío
	}
	
	public List<FileSystem> buscarTodos(String nombre){
		List<FileSystem> lista = new ArrayList<>();
		lista = this.elementos.stream()
				.flatMap(e -> e.buscarTodos(nombre).stream())//primero asegurarme de tener un archivo
				.filter(e -> e!=null)//despues me fijo que coincida
				.collect(Collectors.toList());
		if (this.getNombre().equals(nombre))
			lista.add(this);
		return lista;
	}
	
	/*
	public List<FileSystem> buscarTodos(String nombre){
		return this.elementos.stream()
				.map(e -> e.buscar(nombre))
				.collect(Collectors.toList()); //filtramos los nulos = los que no coinciden
	}
	
	
	public String listadoDeContenido() {
		//return this.getNombre() + "/" + this.elementos.stream().map(e -> e.listadoDeContenido()).collect(Collectors.joining("\n")); //se olvida muchos nombres de directorios en la recursión
		return this.elementos.stream().map(e -> this.getNombre() + "/" + e.listadoDeContenido()).collect(Collectors.joining("\n"));  //se olvida pocos nombres de directorios en la recursión
	}*/
	
	public boolean esDirectorio() {
		return true;
	}
	
	public String listadoDeContenido() {
	    return listadoDeContenido("");
	}

	private String listadoDeContenido(String parentPath) {
	    StringBuilder result = new StringBuilder();
	    String path;
	    if (parentPath.equals(""))
	    	path = this.getNombre();
	    else
	    	path = parentPath + "/" + this.getNombre();
	    
	    result.append(path).append("\n"); //para mostrar el nombre del directorio también

	    for (FileSystem elemento : this.elementos) { //ahora avanzxo por cada archivo y carpetas que tenga dentro
	        if (elemento.esDirectorio())
	            result.append(((Directorio) elemento).listadoDeContenido(path)); //agrego el path del directorio sin saltar de línea para seguir avanzando
	        else
	            result.append(path).append("/").append(elemento.getNombre()).append("\n"); //llegué a una hoja del árbol, poner un salto de línea
	    }

	    return result.toString();
	}
}
