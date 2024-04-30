package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class Director {

	private Constructor constructor;
	
	public Director(Constructor constructor) {
		this.constructor = constructor;
	}
	
	public Personaje crear() {
		return this.constructor.vida().arma().armadura().habilidad().build();
	}
	
	public void setConstructor(Constructor constructor) {
		
	}
}
