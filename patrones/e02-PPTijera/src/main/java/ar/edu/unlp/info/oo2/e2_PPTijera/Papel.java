package ar.edu.unlp.info.oo2.e2_PPTijera;

public class Papel extends Jugada{
	
//	public String jugar(Jugada jugada) { // esto es otra forma válida de hacerlo
//		return jugada.contraPapel();
//	}
//	public String contraPiedra() {
//		return "gana jugador 1";
//	}
//	public String contraPapel() {
//		return "empata";
//	}
//	public String contraTijera() {
//		return "pierde";
//	}
//	public String contraLagarto() {
//		return "pierde";
//	}
//	public String contraSpock() {
//		return "gana";
//	}
	
	public String jugar(Piedra piedra) {
		return "gana jugador 1";
	}
	public String jugar(Papel papel) {
		return "empate";
	}
	public String jugar(Tijera tijera) {
		return "pierde jugador 1";
	}
	public String jugar(Lagarto lagarto) {
		return "pierde jugador 1";
	}
	public String jugar(Spock spock) {
		return "gana jugador 1";
	}
}

