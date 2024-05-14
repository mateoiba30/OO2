package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class CreadorArquero extends Constructor {

	public Constructor vida() {
		this.setVida(100);
		return this;
	}
	public Constructor arma() {
		this.setArma(new Arco());
		return this;
	}
	public Constructor armadura() {
		this.setArmadura(new Cuero());
		return this;
	}
	public Constructor habilidad() {
		this.setHabilidad(new Distancia());
		return this;
	}
}
