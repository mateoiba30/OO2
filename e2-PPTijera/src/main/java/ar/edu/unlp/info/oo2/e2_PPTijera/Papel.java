package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Papel implements Jugada{
	
	public String jugar(Jugada jugada) {
		return jugada.contraPapel();
	}
	
	public String jugar(Jugada jugada) {
		return jugada.jugar(this);//diferencio funcinoes segun el parametro
	}
	
	//double dispatch
	
	public String jugar(Piedra piedra) {
		return "papel";
	}

	public String contraPiedra() {
		return "gana jugador 1";
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

