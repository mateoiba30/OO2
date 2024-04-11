package ar.edu.unlp.info.oo2.ej7_filesystem_composite;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class Archivo extends FileSystem{
	
	private String datos;
	private int tamanio;
	
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		super(nombre, fecha);
		this.tamanio = tamano;
	}
	
	public int tamanioTotalOcupado() {
		return this.tamanio;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public Optional<FileSystem> buscar(String nombre){
		if (this.getNombre().equals(nombre))
			return Optional.of(this);
		return Optional.empty();
	}
	
	/*
	public List<FileSystem> buscarTodos(String nombre){
		List<FileSystem> lista = new ArrayList<>();
		if (this.getNombre() == nombre)
			lista.add(this);
		return lista;
	}*/
	
	public String listadoDeContenido() {
		return this.getNombre();
	}
	
}
