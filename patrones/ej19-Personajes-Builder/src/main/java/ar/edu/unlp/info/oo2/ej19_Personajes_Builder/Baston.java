package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class Baston implements Arma{

	public double danioCausado(Cuero cuero) {
		return 2;
	}
	
	public double danioCausado(Hierro hierro) {
		return 1;
	}
	
	public double danioCausado(Acero acero) {
		return 1;
	}
}