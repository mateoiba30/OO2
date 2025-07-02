package ar.edu.info.oo2.parcial;

public class ConSeguro extends Decorador{
	public ConSeguro(Componente siguiente){
		super(siguiente);
	}
	
	protected double costoExtra(){
		return this.getValorDeclarado() * 0.20;
	}
	protected String descripcionExtra(){
		return "con seguro";
	}
}