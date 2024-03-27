package ar.edu.unlp.info.oo2.ej4_EmpleadoTemplateMethod;

public class Temporario extends Empleado {
	
	private int horasTrabajo;
	private boolean casado;
	private int cantidadHijos;
	
	public Temporario(int horasTrabajo, boolean casado, int cantidadHijos) {
		this.horasTrabajo = horasTrabajo;
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
	}
	
	public double basico() {
		return 20000 + this.horasTrabajo*300;
	}
	
	public double adicional() {
		if (this.casado)
			return 5000 + 2000*this.cantidadHijos;
		else
			return 2000*this.cantidadHijos;
	}

}
