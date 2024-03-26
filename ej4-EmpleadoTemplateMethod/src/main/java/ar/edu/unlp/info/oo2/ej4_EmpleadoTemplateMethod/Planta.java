package ar.edu.unlp.info.oo2.ej4_EmpleadoTemplateMethod;

public class Planta {

	private boolean casado;
	private int cantidadHijos;
	private int aniosAntiguedad;
	
	public Planta(boolean casado, int cantidadHijos, int aniosAntiguedad) {
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
		this.aniosAntiguedad = aniosAntiguedad;
	}
	
	public double basico() {
		return 50000;
	}
	
	public double adicional() {
		double total = 0;
		
		if(casado)
			total += 5000;
		total+= 2000*(this.cantidadHijos+this.aniosAntiguedad);
		return total;		
	}
}
