package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Papel implements Jugada{

	public String contraPiedra() {
		return "gana";
	}
	public String contraPapel() {
		return "empata";
	}
	public String contraTijera() {
		return "pierde";
	}
	public String contraLagarto() {
		return "pierde";
	}
	public String contraSpock() {
		return "gana";
	}
}

