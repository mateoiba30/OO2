package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class CreadorGuerrero extends Constructor {
	
	public Constructor vida() {
		this.setVida(100);
		return this;
	}
	public Constructor arma() {
		this.setArma(new Espada());
		return this;
	}
	public Constructor armadura() {
		this.setArmadura(new Acero());
		return this;
	}
	public Constructor habilidad() {
		this.setHabilidad(new Melee());
		return this;
	}
}
