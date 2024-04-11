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
	
	public Optional<FileSystem> buscar(String nombre){
		return this.elementos.stream().map(e -> e.buscar(nombre)).filter(Optional::isPresent).findFirst().orElse(null); //si no pongo el filter va a mandar el 1er optional aunque esté vacío
	}
	
	public List<Optional<FileSystem>> buscarTodos(String nombre){
		return this.elementos.stream().map(e -> e.buscar(nombre)).collect(Collectors.toList()); //filtramos los nulos = los que no coinciden
	}
	
	public String listadoDeContenido() {
		return this.getNombre() + "/" + this.elementos.stream().map(e -> e.listadoDeContenido()).collect(Collectors.joining("\n")); //junto los resultados en un string separado en diferentes líneas
	}
}
