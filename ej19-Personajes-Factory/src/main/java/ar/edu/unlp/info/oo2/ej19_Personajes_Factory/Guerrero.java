package ar.edu.unlp.info.oo2.ej19_Personajes_Factory;

public class Guerrero implements Constructor {

	public Personaje crearPersonaje() {
		Habilidad melee = new Melee();
		Armadura acero = new Acero();
		Arma espada= new Espada();
		return new Personaje(100,melee, acero, espada);
	}
}
