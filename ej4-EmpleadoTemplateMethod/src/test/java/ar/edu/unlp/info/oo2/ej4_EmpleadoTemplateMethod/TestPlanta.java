package ar.edu.unlp.info.oo2.ej4_EmpleadoTemplateMethod;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlanta {

	Empleado planta1;
	int aniosAntiguedad1;
	boolean casado1;
	int cantidadHijos1;
	Empleado planta2;
	int aniosAntiguedad2;
	boolean casado2;
	int cantidadHijos2;
	
	@BeforeEach
	public void setup() {
		this.aniosAntiguedad1 = 12;
		this.casado1 = false;
		this.cantidadHijos1 = 43;
		this.planta1 = new Planta( aniosAntiguedad1,  casado1,  cantidadHijos1);
		
		this.aniosAntiguedad2 = 23;
		this.casado2 = true;
		this.cantidadHijos2 = 11;
		this.planta2 = new Planta( aniosAntiguedad2,  casado2,  cantidadHijos2);
	}
	
	@Test
	public void testSueldo() {
		assertEquals( 50000*0.87 + (2000*(this.cantidadHijos1 + this.aniosAntiguedad1))*0.95, this.planta1.sueldo());
		assertEquals( 50000*0.87 + (5000 + 2000*(this.cantidadHijos2 + this.aniosAntiguedad2))*0.95, this.planta2.sueldo());
	}
}
