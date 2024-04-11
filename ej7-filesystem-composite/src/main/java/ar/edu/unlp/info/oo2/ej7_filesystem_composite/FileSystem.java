package ar.edu.unlp.info.oo2.ej7_filesystem_composite;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public abstract class FileSystem {
	
	private String nombre;
	private LocalDate fecha;
	
	public FileSystem(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public abstract int tamanioTotalOcupado();
	
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();
	
	public abstract FileSystem buscar(String nombre);
	
	public abstract List<FileSystem> buscarTodos(String nombre);
	
	public abstract String listadoDeContenido();
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public abstract boolean esDirectorio();
}
