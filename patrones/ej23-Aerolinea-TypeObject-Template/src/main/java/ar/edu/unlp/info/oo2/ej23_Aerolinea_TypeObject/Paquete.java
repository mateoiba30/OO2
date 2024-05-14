package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;

public class Paquete {
	
	private double ancho;
	private double profundidad;
	private double altura;
	private double peso;
	
	public Paquete(double ancho, double profundidad, double altura, double peso) {
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.altura = altura;
		this.peso = peso;
	}
	
	public double getCostoBase() {
		return this.peso * 3000;
	}
	
	public double getPeso() {
		return this.peso;
	}
}
