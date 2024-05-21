package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{
	
	public LlamadaInternacional(int duracion) {
		super(duracion);
	}
	
	public double precioPorSegundo() {
		return 150;
	}
	
	public double precioBase() {
		return 50;
	}
}
