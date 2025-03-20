package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Piedra extends Jugada{

	public String jugar(Piedra piedra) {
		return "empate";
	}
	public String jugar(Papel papel) {
		return "pierde jugador 1";
	}
	public String jugar(Tijera tijera) {
		return "gana jugador 1";
	}
	public String jugar(Lagarto lagarto) {
		return "gana jugador 1";
	}
	public String jugar(Spock spock) {
		return "pierde jugador 1";
	}
	
}
