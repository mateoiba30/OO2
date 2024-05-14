package ar.edu.unlp.info.oo2.ej19_Personajes_Factory;

public class Personaje {
	
	private int vida;
	private Habilidad habilidad;
	private Armadura armadura;
	private Arma arma;
	
	public Personaje(int vida, Habilidad habilidad, Armadura armadura, Arma arma) {
		super();
		this.vida = vida;
		this.habilidad = habilidad;
		this.armadura = armadura;
		this.arma = arma;
	}
	
}
