package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private static final double iva = 0.21;
	
	private String origen;
	private String destino;
	private int duracion;
	
	public Llamada(String origen, String destino, int duracion) {
		this.origen = origen;
		this.destino = destino;
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
