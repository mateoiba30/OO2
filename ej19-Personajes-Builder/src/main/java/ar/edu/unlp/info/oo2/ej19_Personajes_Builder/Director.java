package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class Director {

	private Constructor constructor;
	
	public Director(Constructor constructor) {
		this.constructor = constructor;
	}
	
	public Personaje crear() {
		Personaje p = new Personaje();
		p.setVida(100);
		this.constructor.ponerArma(p);
		this.constructor.ponerArmadura(p);
		this.constructor.ponerHabilidad(p);
		return p;
	}
}
