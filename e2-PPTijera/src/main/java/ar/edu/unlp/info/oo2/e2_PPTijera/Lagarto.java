package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Lagarto extends Jugada{
	
	public String jugar(Piedra piedra) {
		return "pierde jugador 1";
	}
	public String jugar(Papel papel) {
		return "gana jugador 1";
	}
	public String jugar(Tijera tijera) {
		return "pierde jugador 1";
	}
	public String jugar(Lagarto lagarto) {
		return "empate";
	}
	public String jugar(Spock spock) {
		return "gana jugador 1";
	}
}
