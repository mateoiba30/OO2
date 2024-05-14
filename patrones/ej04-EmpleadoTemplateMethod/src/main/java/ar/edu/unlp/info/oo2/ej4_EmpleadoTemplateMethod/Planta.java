package ar.edu.unlp.info.oo2.ej4_EmpleadoTemplateMethod;

public class Planta extends Empleado {

	private boolean casado;
	private int cantidadHijos;
	private int aniosAntiguedad;
	
	public Planta(int aniosAntiguedad, boolean casado, int cantidadHijos) {
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
		this.aniosAntiguedad = aniosAntiguedad;
	}
	
	public double basico() {
		return 50000;
	}
	
	public double adicional() {
		
		if(this.casado)
			return 5000 + 2000*(this.cantidadHijos+this.aniosAntiguedad);
		else
			return 2000*(this.cantidadHijos+this.aniosAntiguedad);		
	}
}
