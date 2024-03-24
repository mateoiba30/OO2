package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Jugador {
	
	Jugada jugada;
	
	public Jugador(Jugada jugada) {
		this.jugada = jugada;
	}
	
	public String jugarContra(Jugador jugador) {
		return this.jugada.jugar(jugador.getJugada());
	}
	
	public Jugada getJugada() {
		return this.jugada;
	}

}
