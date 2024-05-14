package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

import java.time.LocalDate;

public class File implements FileManager {

	private String nombre;
	private String extension;
	private double tamanio;
	private LocalDate fechaInicio;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public File(String nombre, String extension, double tamanio, LocalDate fechaInicio, LocalDate fechaModificacion,String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
		this.fechaInicio = fechaInicio;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getTamanio() {
		return String.valueOf(this.tamanio);
	}

	public String getFechaInicio() {
		return String.valueOf(this.fechaInicio);
	}

	public String getFechaModificacion() {
		return String.valueOf(this.fechaModificacion);
	}

	public String getPermisos() {
		return permisos;
	}
	
	public String prettyPrint() {
		return "";
	}
	
}
