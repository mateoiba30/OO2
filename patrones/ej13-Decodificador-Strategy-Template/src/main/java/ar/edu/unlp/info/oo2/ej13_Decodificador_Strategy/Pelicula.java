package ar.edu.unlp.info.oo2.ej13_Decodificador_Strategy;

import java.util.List;
import java.util.ArrayList;

public class Pelicula{

	private String titulo;
	private Integer anio;
	private Double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, Double puntaje, Integer anio) {
		this.titulo = titulo;
		this.anio = anio;
		this.puntaje = puntaje;
		this.similares = new ArrayList<>();
	}
	
	public void establecerSimilitud(Pelicula pelicula) {
		if (!this.similares.contains(pelicula)) {
			this.similares.add(pelicula);
			pelicula.establecerSimilitud(this);
		}
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public List<Pelicula> getSimilares(){
		return this.similares;
	}
	
	public Integer getAnio() {
		return this.anio;
	}
	
	public Double getPuntaje() {
		return this.puntaje;
	}
	
	public int compararAnio(Pelicula pelicula) {//hacerlo con compare to
		return this.anio.compareTo(pelicula.getAnio());
	}
	
	public int compararPuntaje(Pelicula pelicula) {//hacerlo con compare to
		return this.puntaje.compareTo(pelicula.getPuntaje());
	}
}
