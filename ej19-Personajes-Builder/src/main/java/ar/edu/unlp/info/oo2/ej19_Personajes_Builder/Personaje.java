package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

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
	
	public Personaje() {
		
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Habilidad getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(Habilidad habilidad) {
		this.habilidad = habilidad;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	
	
}
