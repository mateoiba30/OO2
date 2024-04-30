package ar.edu.unlp.info.oo2.ej22_SubteWay_Builder;

public class Sanguche {

	private Elemento pan;
	private Elemento aderezo;
	private Elemento principal;
	private Elemento adicional;
	
	public Sanguche(Elemento pan, Elemento aderezo, Elemento principal, Elemento adicional) {
		this.pan = pan;
		this.aderezo = aderezo;
		this.principal = principal;
		this.adicional = adicional;
	}
	
	public Sanguche() {
		
	}
	
	public double calcularPrecio() {
		return this.pan.getPrecio() + this.aderezo.getPrecio() + this.principal.getPrecio() + this.adicional.getPrecio();
	}
	
	public Elemento getPan() {
		return pan;
	}
	public void setPan(Elemento pan) {
		this.pan = pan;
	}
	public Elemento getAderezo() {
		return aderezo;
	}
	public void setAderezo(Elemento aderezo) {
		this.aderezo = aderezo;
	}
	public Elemento getPrincipal() {
		return principal;
	}
	public void setPrincipal(Elemento principal) {
		this.principal = principal;
	}
	public Elemento getAdicional() {
		return adicional;
	}
	public void setAdicional(Elemento adicional) {
		this.adicional = adicional;
	}
	
	
}
