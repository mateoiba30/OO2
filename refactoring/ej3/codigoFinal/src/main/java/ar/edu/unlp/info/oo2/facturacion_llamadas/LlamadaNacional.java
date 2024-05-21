package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{
	
	public LlamadaNacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
	}
	
	public double precioPorSegundo() {
		return 3;
	}
	
	public double precioBase() {
		return 0;
	}
	
}
