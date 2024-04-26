package ar.edu.unlp.info.oo2.ej19_Personajes_Factory;

public class Mago implements Constructor {

	public Personaje crearPersonaje() {
		Habilidad magia = new Magia();
		Armadura cuero = new Cuero();
		Arma baston = new Baston();
		return new Personaje(100,magia, cuero, baston);
	}
}
