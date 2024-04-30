package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class CreadorThor extends Constructor {

	public Constructor vida() {
		this.setVida(100);
		return this;
	}
	public Constructor arma() {
		this.setArma(new Martillo());
		return this;
	}
	public Constructor armadura() {
		this.setArmadura(new Hierro());
		return this;
	}
	public Constructor habilidad() {
		this.setHabilidad(new Rayos());
		return this;
	}
}
