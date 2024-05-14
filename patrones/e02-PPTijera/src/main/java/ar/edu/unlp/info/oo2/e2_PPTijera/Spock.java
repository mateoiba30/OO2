package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Spock extends Jugada{

	public String contraPiedra() {
		return "gana";
	}
	public String contraPapel() {
		return "pierde";
	}
	public String contraTijera() {
		return "gana";
	}
	public String contraLagarto() {
		return "pierde";
	}
	public String contraSpock() {
		return "empata";
	}
	
	public String jugar(Piedra piedra) {
		return "pierde jugador 1";
	}
	public String jugar(Papel papel) {
		return "pierde jugador 1";
	}
	public String jugar(Tijera tijera) {
		return "gana jugador 1";
	}
	public String jugar(Lagarto lagarto) {
		return "pierde jugador 1";
	}
	public String jugar(Spock spock) {
		return "empate";
	}
}
