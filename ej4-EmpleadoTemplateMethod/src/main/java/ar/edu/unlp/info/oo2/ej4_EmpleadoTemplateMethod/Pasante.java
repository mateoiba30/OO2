package ar.edu.unlp.info.oo2.ej4_EmpleadoTemplateMethod;

public class Pasante extends Empleado {

	private int cantidadExamenesRendidos;
	
	public Pasante(int cantidadExamenesRendidos) {
		this.cantidadExamenesRendidos = cantidadExamenesRendidos;
	}
	
	public double basico() {
		return 20000;
	}
	
	public double adicional() {
		return 2000*this.cantidadExamenesRendidos;
	}
}
