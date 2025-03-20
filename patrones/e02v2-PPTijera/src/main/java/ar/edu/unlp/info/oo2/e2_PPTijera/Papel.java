package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Papel implements Jugada{
	
	public String jugar(Jugada jugada) {
		return jugada.contraPiedra();
	}
	public String contraPiedra() {
		return "gana papel";
	}
	public String contraPapel() {
		return "empate";
	}
	public String contraTijera() {
		return "gana tijera";
	}

}

