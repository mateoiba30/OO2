package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class CreadorGuerrero implements Constructor {

	public Personaje ponerArma(Personaje p) {
		p.setArma(new Espada());
		return p;
	}
	
	public Personaje ponerArmadura(Personaje p) {
		p.setArmadura(new Acero());
		return p;
	}
	
	public Personaje ponerHabilidad(Personaje p) {
		p.setHabilidad(new Melee());
		return p;
	}
}
