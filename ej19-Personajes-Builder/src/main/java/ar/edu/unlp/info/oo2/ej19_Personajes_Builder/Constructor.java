package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public abstract class Constructor {

	private int vida;
	private Arma arma;
	private Armadura armadura;
	private Habilidad habilidad;
	
	public abstract Constructor vida();
	public abstract Constructor arma();
	public abstract Constructor armadura();
	public abstract Constructor habilidad();
	
	public Personaje build() {
		Personaje p = new Personaje(this.vida, this.habilidad, this.armadura, this.arma);
		return p;
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public Armadura getArmadura() {
		return armadura;
	}
	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	public Habilidad getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(Habilidad habilidad) {
		this.habilidad = habilidad;
	}
	
	
}
