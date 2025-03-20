package ar.edu.unlp.info.oo2.e2_PPTijera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JuegoTest {

	@Test
	void testGanador() {
		Jugada papel = new Papel();
		Jugada piedra = new Piedra();
		Jugada tijera = new Tijera();

		assertEquals("empate", piedra.contraPiedra());
		assertEquals("gana papel", piedra.contraPapel());
		assertEquals("gana piedra", piedra.contraTijera());
		
		assertEquals("gana papel", papel.contraPiedra());
		assertEquals("empate", papel.contraPapel());
		assertEquals("gana tijera", papel.contraTijera());

		assertEquals("gana piedra", tijera.contraPiedra());
		assertEquals("gana tijera", tijera.contraPapel());
		assertEquals("empate", tijera.contraTijera());
	}

}