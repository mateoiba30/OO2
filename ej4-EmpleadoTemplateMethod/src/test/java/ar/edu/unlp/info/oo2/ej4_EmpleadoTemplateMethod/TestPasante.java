package ar.edu.unlp.info.oo2.ej4_EmpleadoTemplateMethod;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPasante {

	Empleado pasante1;
	int cantidadExamenesRendidos1;
	Empleado pasante2;
	int cantidadExamenesRendidos2;
	
	@BeforeEach
	public void setup() {
		this.cantidadExamenesRendidos1 = 4;
		this.pasante1 = new Pasante(cantidadExamenesRendidos1);
		
		this.cantidadExamenesRendidos2 = 14;
		this.pasante2 = new Pasante(cantidadExamenesRendidos2);
	}
	
	@Test
	public void testSueldo() {
		assertEquals( 20000*0.87 + 2000*this.cantidadExamenesRendidos1*0.95, this.pasante1.sueldo());
		assertEquals( 20000*0.87 + 2000*this.cantidadExamenesRendidos2*0.95, this.pasante2.sueldo());
	}
}