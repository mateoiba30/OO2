package ar.edu.unlp.info.oo2.ej22_SubteWay_Builder;

public class Elemento {
	
	private String tipo;
	private double precio;
	public Elemento(String tipo, double precio) {
		this.tipo = tipo;
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
