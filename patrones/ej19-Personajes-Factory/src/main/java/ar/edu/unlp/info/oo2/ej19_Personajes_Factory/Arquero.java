package ar.edu.unlp.info.oo2.ej19_Personajes_Factory;

public class Arquero implements Constructor {

	public Personaje crearPersonaje() {
		Habilidad distancia = new Distancia();
		Armadura cuero= new Cuero();
		Arma arco = new Arco();
		return new Personaje(100, distancia, cuero, arco);
	}
}
