package ar.edu.unlp.info.oo2.ej13_Decodificador_Strategy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Year;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {
	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	

	@BeforeEach
	void setUp() throws Exception {
		this.thor = new Pelicula("Thor", 7.9, 2007);
		this.capitanAmerica = new Pelicula("Capitan America", 7.8, 2016);
		this.ironMan = new Pelicula("Iron man", 7.9, 2010);
		this.dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
		this.rocky = new Pelicula("Rocky", 8.1, 1976);
		this.rambo = new Pelicula("Rambo", 7.8, 1979);
		
		this.thor.establecerSimilitud(capitanAmerica);
		this.thor.establecerSimilitud(ironMan);
		this.capitanAmerica.establecerSimilitud(thor);
		this.capitanAmerica.establecerSimilitud(ironMan);
		this.ironMan.establecerSimilitud(thor);
		this.ironMan.establecerSimilitud(capitanAmerica);
		this.rocky.establecerSimilitud(rambo);
		this.rambo.establecerSimilitud(rocky);
		
		this.decodificador = new Decodificador(new Novedad());
		
		this.decodificador.agregarAGrilla(thor);
		this.decodificador.agregarAGrilla(capitanAmerica);
		this.decodificador.agregarAGrilla(ironMan);
		this.decodificador.agregarAGrilla(dunkirk);
		this.decodificador.agregarAGrilla(rocky);
		this.decodificador.agregarAGrilla(rambo);
		
		this.decodificador.agregarReproducida(thor);
		this.decodificador.agregarReproducida(rocky);
	}

	@Test
	void testObtenerSugerencias() {
		assertTrue(this.decodificador.sugerir3Peliculas().contains(dunkirk));
		assertTrue(this.decodificador.sugerir3Peliculas().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerir3Peliculas().contains(ironMan));
		
		this.decodificador.setEstrategia(new Similaridad());
		//System.out.println(this.decodificador.mostrarTitulosSugeridos());
		assertTrue(this.decodificador.sugerir3Peliculas().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerir3Peliculas().contains(ironMan));
		assertTrue(this.decodificador.sugerir3Peliculas().contains(rambo));
		
		this.decodificador.setEstrategia(new Puntaje());
		assertTrue(this.decodificador.sugerir3Peliculas().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerir3Peliculas().contains(ironMan));
		assertTrue(this.decodificador.sugerir3Peliculas().contains(dunkirk));
	}

}