package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Lagarto implements Jugada{

	public String contraPiedra() {
		return "pierde";
	}
	public String contraPapel() {
		return "gana";
	}
	public String contraTijera() {
		return "pierde";
	}
	public String contraLagarto() {
		return "empata";
	}
	public String contraSpock() {
		return "gana";
	}
}
