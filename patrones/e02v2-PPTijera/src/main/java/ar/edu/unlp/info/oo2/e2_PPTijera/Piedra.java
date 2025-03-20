package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Piedra implements Jugada{
	
	public String jugar(Jugada jugada) {
		return jugada.contraPiedra();
	}
	public String contraPiedra() {
		return "empate";
	}
	public String contraPapel() {
		return "gana papel";
	}
	public String contraTijera() {
		return "gana piedra";
	}

}

