package ar.edu.unlp.info.oo2.ej19_Personajes_Factory;

public class Espada implements Arma {

	public double danioCausado(Cuero cuero) {
		return 8;
	}
	
	public double danioCausado(Hierro hierro) {
		return 5;
	}
	
	public double danioCausado(Acero acero) {
		return 3;
	}
}
