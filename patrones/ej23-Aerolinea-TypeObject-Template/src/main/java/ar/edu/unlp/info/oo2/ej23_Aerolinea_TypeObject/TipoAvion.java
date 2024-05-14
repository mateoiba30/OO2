package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;

public class TipoAvion {

	private double cargaMaxima;
	private int cantidadAsientos;
	
	public TipoAvion(double cargaMaxima, int cantidadAsientos) {
		this.cargaMaxima = cargaMaxima;
		this.cantidadAsientos = cantidadAsientos;
	}
	
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public int getCantidadAsientos() {
		return cantidadAsientos;
	}
	
}
