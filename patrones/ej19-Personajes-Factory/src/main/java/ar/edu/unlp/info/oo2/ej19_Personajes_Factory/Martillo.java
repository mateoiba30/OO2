package ar.edu.unlp.info.oo2.ej19_Personajes_Factory;

public class Martillo implements Arma{

	public double danioCausado(Cuero cuero) {
		return 7;
	}
	
	public double danioCausado(Hierro hierro) {
		return 6;
	}
	
	public double danioCausado(Acero acero) {
		return 5;
	}
}