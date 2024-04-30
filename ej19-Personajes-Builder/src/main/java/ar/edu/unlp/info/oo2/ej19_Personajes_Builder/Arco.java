package ar.edu.unlp.info.oo2.ej19_Personajes_Builder;

public class Arco implements Arma {

	public double danioCausado(Cuero cuero) {
		return 5;
	}
	
	public double danioCausado(Hierro hierro) {
		return 3;
	}
	
	public double danioCausado(Acero acero) {
		return 2;
	}
}