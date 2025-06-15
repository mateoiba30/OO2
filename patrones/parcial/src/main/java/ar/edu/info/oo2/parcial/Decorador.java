package ar.edu.info.oo2.parcial;

public abstract class Decorador implements Componente{
	private Componente siguiente;
	
	public Decorador(Componente siguiente){
		this.siguiente = siguiente;
	}
	
	public String getDescripcion(){
		return this.siguiente.getDescripcion() + " " + this.descripcionExtra();
	}
	public String getDestinatario(){
		return this.siguiente.getDestinatario();
	}
	public String getDireccionDestinatario(){
		return this.siguiente.getDireccionDestinatario();
	}
	public double getValorDeclarado() {
		return this.siguiente.getValorDeclarado();
	}
	public double getCostoEnvio(){
		return this.siguiente.getCostoEnvio() + this.costoExtra();
	}
	protected abstract double costoExtra();
	protected abstract String descripcionExtra();
	
}