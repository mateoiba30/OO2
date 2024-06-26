package ar.edu.unlp.info.oo2.e1_twitter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TestUsuario {
	
	Usuario usuario1;
	Usuario usuario2;
	Usuario usuario3;
	Posteo tweet;
	Posteo retweet;
	Posteo retweetAjeno1;
	Posteo retweetAjeno2;
	Posteo tweetAjeno2;
	Posteo retweetAjeno3;
	Posteo tweetAjeno3;
	Posteo tweetDobleAjeno;
	Posteo tweetDobleAjeno2;
	Posteo retweetAjeno4;
	Posteo retweetAjeno5;
	Posteo retweetDobleAjeno;
	Posteo retweetDobleAjeno2;
	List<Posteo> listaPosteos;
	
	@BeforeEach
	void setup() {
		listaPosteos = new ArrayList<>();
		
		usuario1 = new Usuario("Mateo");
		usuario2 = new Usuario("Juan");
		usuario3= new Usuario("Pepe");
		
		tweet = usuario1.tweetear("1er tweet");
		retweet = usuario1.retweetear(tweet);
		
		tweetAjeno2 = usuario2.tweetear("Este es nu tweet de otro usuario");
		retweetAjeno2 = usuario1.retweetear(tweetAjeno2);
		
		tweetAjeno3 = usuario3.tweetear("Este es nu tweet de otro usuario");
		retweetAjeno3 = usuario1.retweetear(tweetAjeno3);
		
		tweetDobleAjeno = usuario3.tweetear("Este es un tweet lejano");
		retweetDobleAjeno = usuario2.retweetear(tweetDobleAjeno);
		retweetAjeno4 = usuario1.retweetear(retweetDobleAjeno);
		
		tweetDobleAjeno2 = usuario3.tweetear("Este es un tweet lejano");
		retweetDobleAjeno2 = usuario2.retweetear(tweetDobleAjeno2);
		retweetAjeno5 = usuario1.retweetear(retweetDobleAjeno2);
		
		listaPosteos.add(tweetAjeno2);
		listaPosteos.add(tweetAjeno3);
		//listaPosteos.add(retweetDobleAjeno);
		listaPosteos.add(tweetDobleAjeno);
	}
	
	@Test
	void testPostear() {
		assertEquals(usuario1.getPosteos().size(), 6);
	}

	@Test
	void testEsIgual() {
		assertTrue(usuario1.esIgual("Mateo"));
		assertFalse(usuario1.esIgual("Mateo "));
	}
	
	@Test
	void testGetPosteosRelacionados() {
		assertEquals(usuario1.getPosteosRelacionadosSize(listaPosteos), 3);
		assertEquals(usuario1.getPosteosRelacionados(usuario3.getPosteos()).size(), 1); //solo uno está directamente relacionado
	}
	
	@Test
	void testEliminarPosteosRelacionados() {
		usuario1.eliminarPosteosRelacionados(listaPosteos);
		assertEquals(usuario1.getPosteosSize(), 3);
		assertEquals(usuario1.getPosteosRelacionadosSize(listaPosteos), 0);
		
//		usuario1.eliminarPosteosRelacionados(usuario3.getPosteos());
//		assertEquals(usuario1.getPosteosSize(), 3);
//		assertEquals(usuario1.getPosteosRelacionadosSize(usuario3.getPosteos()), 0);
	}
}
