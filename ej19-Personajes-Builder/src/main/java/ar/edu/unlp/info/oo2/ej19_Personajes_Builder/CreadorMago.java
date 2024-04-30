package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class CreadorMago extends Constructor {
	
	public Constructor vida() {
		this.setVida(100);
		return this;
	}
	public Constructor arma() {
		this.setArma(new Baston());
		return this;
	}
	public Constructor armadura() {
		this.setArmadura(new Cuero());
		return this;
	}
	public Constructor habilidad() {
		this.setHabilidad(new Magia());
		return this;
	}
}
