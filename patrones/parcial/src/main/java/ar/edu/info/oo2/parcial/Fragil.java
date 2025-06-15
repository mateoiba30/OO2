package ar.edu.info.oo2.parcial;

public class Fragil extends Decorador{
	public Fragil (Componente siguiente){
		super(siguiente);
	}

	protected double costoExtra(){
		return 0;
	}
	protected String descripcionExtra(){
		return "fragil";
	}
}