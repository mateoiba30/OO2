package ar.edu.unlp.info.oo2.ej19_Personajes_Factory;

public class Thor implements Constructor {

	public Personaje crearPersonaje() {
		Habilidad rayos = new Rayos();
		Armadura hierro = new Hierro();
		Arma martillo = new Martillo();
		return new Personaje(100,rayos, hierro, martillo);
	}
}
