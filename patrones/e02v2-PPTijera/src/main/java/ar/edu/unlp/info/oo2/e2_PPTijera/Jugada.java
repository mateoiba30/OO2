package ar.edu.unlp.info.oo2.e2_PPTijera;

interface Jugada {
	
	public abstract String jugar(Jugada jugada);
	
	public abstract String contraPiedra(); //podría hacer que la función se llame contraPiedray no mandar this cuando llamo a la función

	public abstract String contraPapel();
	
	public abstract String contraTijera();

}
