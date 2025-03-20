package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Tijera implements Jugada{
	
	public String jugar(Jugada jugada) {
		return jugada.contraTijera();
	}
	public String contraPiedra() {
		return "gana piedra";
	}
	public String contraPapel() {
		return "gana tijera";
	}
	public String contraTijera() {
		return "empate";
	}

}


