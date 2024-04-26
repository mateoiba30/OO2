package ar.edu.unlp.info.oo2.ej19_Personajes_Factory;

public class Hierro implements Armadura {

	public double danioRecibido(Arma arma) {
		return arma.danioCausado(this);
	}
}
