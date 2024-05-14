package ar.edu.unlp.info.oo2.ej11_Proyectos_State;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	private Proyecto proyecto;
	private Proyecto proyectoPrecio0;
	
	@BeforeEach
	public void setUp() throws Exception {
		List<Double> sueldos = new ArrayList<>();
		sueldos.add(1500.0);
		sueldos.add(1500.0);
		sueldos.add(1500.0);
		this.proyecto = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,sueldos);
		List<Double> sueldos2 = new ArrayList<>();
		sueldos.add(0.0);
		sueldos.add(0.0);
		sueldos.add(0.0);
		this.proyectoPrecio0 = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,sueldos2);
		this.proyecto.aprobarEtapa();
	}

	@Test
	public void testAprobarEtapa() {
	    assertTrue(this.proyecto.getEstado() instanceof Evaluando);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getEstado() instanceof Confirmado);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getEstado() instanceof Confirmado);
		
		Exception exceptionPrecio0 = assertThrows(RuntimeException.class, () -> {this.proyectoPrecio0.aprobarEtapa();});
	    assertEquals("No se puede aprobar un proyecto de precio 0",exceptionPrecio0.getMessage());
	}
	
	@Test
	public void testCostoYPrecioDelProyecto() {
		assertEquals(45000,this.proyecto.costoProyecto());
		assertEquals(3150,Math.floor(this.proyecto.precioProyecto())); //da, pero le erra por 0,00000005 por el punto flotante
		
		assertEquals(0,this.proyectoPrecio0.costoProyecto());
		assertEquals(0,this.proyectoPrecio0.precioProyecto());
	}
	
	@Test
	public void testModificarMargenDeGanancias() {		
		assertTrue(this.proyecto.getEstado() instanceof Evaluando);
		this.proyecto.modificarMargenGanancias(0.10);
		assertEquals(3150,Math.floor(this.proyecto.precioProyecto()));
		this.proyecto.modificarMargenGanancias(0.16);
		assertEquals(3150,Math.floor(this.proyecto.precioProyecto()));
		this.proyecto.modificarMargenGanancias(0.11);
		assertEquals(3150,Math.floor(this.proyecto.precioProyecto()));
		this.proyecto.modificarMargenGanancias(0.15);
		assertEquals(3150,Math.floor(this.proyecto.precioProyecto()));
		this.proyecto.modificarMargenGanancias(0.14);
		assertEquals(0.14, this.proyecto.getMargenGanancias());
		assertEquals(6300,Math.floor(this.proyecto.precioProyecto()));
		
		this.proyecto.aprobarEtapa();
		this.proyecto.modificarMargenGanancias(0.10);
		assertEquals(6300,Math.floor(this.proyecto.precioProyecto()));
	}
	
	@Test
	public void testCancelarProyecto() {
		this.proyecto.cancelarProyecto();
		assertEquals(" (Cancelado) ",this.proyecto.getObjetivo());
		this.proyecto.cancelarProyecto();
		assertEquals(" (Cancelado) ",this.proyecto.getObjetivo());
	}

}