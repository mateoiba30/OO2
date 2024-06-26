package ar.edu.unlp.info.oo2.e1_twitter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTwitter {
	Twitter twitter;
	
	Usuario usuario1;
	Usuario usuario2;
	Usuario usuario3;
	
	Posteo tweet;
	Posteo retweet;
	Posteo retweetAjeno2;
	Posteo tweetAjeno2;
	Posteo retweetAjeno3;
	Posteo tweetAjeno3;
	Posteo tweetDobleAjeno;
	Posteo retweetAjeno4;
	Posteo retweetDobleAjeno;
	
	@BeforeEach
	void setup() {
		this.twitter = new Twitter();
		
		usuario1 = twitter.agregarUsuario("Mateo");
		usuario2 = twitter.agregarUsuario("Juan");
		usuario3 = twitter.agregarUsuario("Pepe");
		
		tweet = usuario1.tweetear("1er tweet");
		retweet = usuario1.retweetear(tweet);	
		
		tweetAjeno2 = usuario2.tweetear("Este es nu tweet de otro usuario");
		retweetAjeno2 = usuario1.retweetear(tweetAjeno2);
		
		tweetAjeno3 = usuario3.tweetear("Este es nu tweet de otro usuario");
		retweetAjeno3 = usuario1.retweetear(tweetAjeno3);
		
		tweetDobleAjeno = usuario3.tweetear("Este es un tweet lejano");
		retweetDobleAjeno = usuario2.retweetear(tweetDobleAjeno);
		retweetAjeno4 = usuario1.retweetear(retweetDobleAjeno);
	}
	
	@Test
	void testAgregarUsuario() {
		twitter.agregarUsuario("Mateo");
		assertEquals(twitter.getUsuariosSize(), 3);
		twitter.agregarUsuario("Mateo ");
		assertEquals(twitter.getUsuariosSize(), 4);
	}
	
	@Test
	void testEliminarUsuarios() {
		twitter.eliminarUsuario("Pepe");
		assertEquals(twitter.getUsuariosSize(), 2);
		assertEquals(usuario1.getPosteosSize(), 3);//elimina lo justo y necesario
		assertEquals(usuario2.getPosteosSize(), 1);
		assertEquals(usuario3.getPosteosSize(), 0); //borra los de pepe
		
		
	}

}
