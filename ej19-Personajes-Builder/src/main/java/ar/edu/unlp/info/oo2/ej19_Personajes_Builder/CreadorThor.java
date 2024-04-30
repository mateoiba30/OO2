package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class CreadorThor implements Constructor {

	public Personaje ponerArma(Personaje p) {
		p.setArma(new Martillo());
		return p;
	}
	
	public Personaje ponerArmadura(Personaje p) {
		p.setArmadura(new Hierro());
		return p;
	}
	
	public Personaje ponerHabilidad(Personaje p) {
		p.setHabilidad(new Rayos());
		return p;
	}
}
