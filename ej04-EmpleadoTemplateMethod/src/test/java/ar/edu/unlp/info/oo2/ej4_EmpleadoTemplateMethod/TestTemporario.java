package ar.edu.unlp.info.oo2.ej4_EmpleadoTemplateMethod;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTemporario {

	Empleado temporario1;
	int horasTrabajo1;
	boolean casado1;
	int cantidadHijos1;
	Empleado temporario2;
	int horasTrabajo2;
	boolean casado2;
	int cantidadHijos2;
	
	@BeforeEach
	public void setup() {
		this.horasTrabajo1 = 12;
		this.casado1 = false;
		this.cantidadHijos1 = 43;
		this.temporario1 = new Temporario( horasTrabajo1,  casado1,  cantidadHijos1);
		
		this.horasTrabajo2 = 23;
		this.casado2 = true;
		this.cantidadHijos2 = 11;
		this.temporario2 = new Temporario( horasTrabajo2,  casado2,  cantidadHijos2);
	}
	
	@Test
	public void testSueldo() {
		assertEquals( (20000 + this.horasTrabajo1*300)*0.87 + 2000*this.cantidadHijos1*0.95, this.temporario1.sueldo());
		assertEquals( (20000 + this.horasTrabajo2*300)*0.87 + (5000 + 2000*this.cantidadHijos2)*0.95, this.temporario2.sueldo());
	}
}
