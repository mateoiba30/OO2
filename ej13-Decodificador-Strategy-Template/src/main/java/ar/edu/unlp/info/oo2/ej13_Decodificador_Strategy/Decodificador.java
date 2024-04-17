package ar.edu.unlp.info.oo2.ej13_Decodificador_Strategy;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Decodificador {
	
	private EstrategiaSugerencia estrategiaSugerencia;
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	
	public Decodificador(EstrategiaSugerencia estrategiaSugerencia) {
		this.grilla = new ArrayList<>();
		this.reproducidas = new ArrayList<>();
		this.estrategiaSugerencia = estrategiaSugerencia;
	}
	
	public Decodificador(List<Pelicula> grilla, List<Pelicula> reproducidas, EstrategiaSugerencia estrategiaSugerencia) {
		this.grilla = grilla;
		this.reproducidas = reproducidas;
		this.estrategiaSugerencia = estrategiaSugerencia;
	}
	
	public void agregarAGrilla(Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	
	public void agregarReproducida(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	public void setEstrategia(EstrategiaSugerencia estrategiaSugerencia) {
		this.estrategiaSugerencia = estrategiaSugerencia;
	}
	
	public List<Pelicula> mostrarGrilla(){
		return this.grilla;
	}
	
	public List<Pelicula> getReproducidas(){
		return this.reproducidas;
	} 
	
	public List<Pelicula> sugerir3Peliculas(){
		return this.estrategiaSugerencia.sugerir3Peliculas(this);
	}
	
	public String mostrarTitulosSugeridos() {
		return this.sugerir3Peliculas().stream().map(p -> p.getTitulo()).collect(Collectors.joining(", "));
	}
	
//	public List<Pelicula> getSimilaresRandom(){//no analiza las similares de una random, analiza las similares de todos
//		return this.reproducidas.stream().map(p -> p.getSimilares()).flatMap(lista -> lista.stream()).distinct().collect(Collectors.toList());
//	}
// NO AGREGAR LÓGICA AL DECODIFICADOR, HACERLO EN LAS ESTRATEGIAS
//	public List<Pelicula> mejorPuntaje(){
//		return this.grilla.stream().sorted((p2, p1) -> p1.compararPuntaje(p2)).collect(Collectors.toList());
//	}
}
