package ar.edu.info.oo2.parcial;

public class EntregaExpress extends Decorador{
	public EntregaExpress (Componente siguiente){
		super(siguiente);
	}
	
	protected double costoExtra(){
		return this.getValorDeclarado() * 0.50 ;
	}
	protected String descripcionExtra(){
		return "entrega express";
	}
}