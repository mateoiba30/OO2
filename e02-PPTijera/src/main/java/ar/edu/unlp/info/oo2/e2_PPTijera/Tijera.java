package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Tijera extends Jugada{

	public String contraPiedra() {
		return "empate";
	}
	public String contraPapel() {
		return "pierde";
	}
	public String contraTijera() {
		return "gana";
	}
	public String contraLagarto() {
		return "gana";
	}
	public String contraSpock() {
		return "pierde";
	}
	
	public String jugar(Piedra piedra) {
		return "pierde jugador 1";
	}
	public String jugar(Papel papel) {
		return "gana jugador 1";
	}
	public String jugar(Tijera tijera) {
		return "empate";
	}
	public String jugar(Lagarto lagarto) {
		return "gana jugador 1";
	}
	public String jugar(Spock spock) {
		return "pierde jugador 1";
	}
}
