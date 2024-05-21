package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private static final double iva = 0.21;
	
	private String origen;
	private String destino;
	private int duracion;
	
	public Llamada(int duracion) {
		this.origen = "";
		this.destino = "";
		this.duracion = duracion;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getDestino() {
		return destino;
	}
	public int getDuracion() {
		return this.duracion;
	}
	public String getOrigen() {
		return origen;
	}
	
	public double precioFinal(Cliente cliente) {
		return this.calcularCostoLlamada() - this.calcularCostoLlamada()*cliente.getDescuento();
	}
	
	public double calcularCostoLlamada() {
		return this.precioDuracion() + this.precioDuracion() * Llamada.iva + this.precioBase();
	}
	
	private double precioDuracion(){
		return this.duracion * this.precioPorSegundo();
	}
	
	public abstract double precioPorSegundo();
	
	public abstract double precioBase();
	
}
