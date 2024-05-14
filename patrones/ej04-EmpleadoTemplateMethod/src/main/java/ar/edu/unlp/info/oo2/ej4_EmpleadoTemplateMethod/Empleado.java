package ar.edu.unlp.info.oo2.ej4_EmpleadoTemplateMethod;

public abstract class Empleado {
	
	public Empleado() {
		
	}
	
	public double sueldo() { //este es mi template method
		double basico = this.basico();
		double adicional = this.adicional();
		return this.basico() + this.adicional() - this.descuento(basico, adicional);
		//return this.basico()*0.87 + this.adicional()*0.95;
	}

	public abstract double basico();
	
	public abstract double adicional();
	
	private double descuento(double basico, double adicional) {
		return basico*0.13 + adicional*0.05;
	}
	
}
