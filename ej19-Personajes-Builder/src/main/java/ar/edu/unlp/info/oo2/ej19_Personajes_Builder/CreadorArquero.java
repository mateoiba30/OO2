package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class CreadorArquero implements Constructor {

	public Personaje ponerArma(Personaje p) {
		p.setArma(new Arco());
		return p;
	}
	
	public Personaje ponerArmadura(Personaje p) {
		p.setArmadura(new Cuero());
		return p;
	}
	
	public Personaje ponerHabilidad(Personaje p) {
		p.setHabilidad(new Distancia());
		return p;
	}
}
