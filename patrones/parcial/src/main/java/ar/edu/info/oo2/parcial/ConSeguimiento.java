package ar.edu.info.oo2.parcial;

public class ConSeguimiento extends Decorador{
	public ConSeguimiento (Componente siguiente){
		super(siguiente);
	}
	
	protected double costoExtra(){
		return 2000;
	}
	protected String descripcionExtra(){
		return "";
	}
}