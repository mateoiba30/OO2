package ar.edu.unlp.info.oo2.e2_PPTijera;

abstract class Jugada {
	
	public String jugar(Jugada jugada) { // 2da forma usando double dispatch
		return jugada.jugar(this);//diferencio funcinoes segun el parametro
	}
	
	public abstract String jugar(Piedra piedra);

	public abstract String jugar(Papel papel);
	
	public abstract String jugar(Tijera tijera);
	
	public abstract String jugar(Lagarto lagarto);
	
	public abstract String jugar(Spock spock);

}
