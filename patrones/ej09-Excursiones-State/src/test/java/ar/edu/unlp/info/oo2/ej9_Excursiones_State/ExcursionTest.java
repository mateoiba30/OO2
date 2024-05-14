package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	private Excursion excursion;
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;

	@BeforeEach
	public void setUp() throws Exception {
		this.excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2023, 4, 6), LocalDate.of(2023, 4, 8),"Terminal de Ómnibus de La Plata", 5000.0,1,2);
		this.usuario1 = new Usuario("Lana", "Del Rey", "lanadelrey1985@gmail.com");
		this.usuario2 = new Usuario("Taylor", "Swift", "taylorswift13@gmail.com");
		this.usuario3 = new Usuario("Lily", "Rabe", "lilyrabe82@gmail.com");
		//System.out.println(this.excursion.obtenerInformacion()); //queria ver como imprimia je
	}

	@Test
	public void testInscribir() {
		assertTrue(this.excursion.getEstado() instanceof Provisoria);
		
		this.excursion.inscribirUsuario(usuario1);
		assertEquals(1,this.excursion.getUsuariosInscriptos().size());
		assertEquals(0,this.excursion.getUsuariosEspera().size());
		assertTrue(this.excursion.getEstado() instanceof Definitiva);
		
		this.excursion.inscribirUsuario(usuario2);
		assertEquals(2,this.excursion.getUsuariosInscriptos().size());
		assertEquals(0,this.excursion.getUsuariosEspera().size());
		assertTrue(this.excursion.getEstado() instanceof Ocupada);
		
		this.excursion.inscribirUsuario(usuario3);
		assertEquals(1,this.excursion.getUsuariosEspera().size());
		assertEquals(2,this.excursion.getUsuariosInscriptos().size());
		assertTrue(this.excursion.getEstado() instanceof Ocupada);
		
		
		assertTrue(this.excursion.getUsuariosInscriptos().contains(usuario1));
		assertTrue(this.excursion.getUsuariosInscriptos().contains(usuario2));
		assertFalse(this.excursion.getUsuariosInscriptos().contains(usuario3));
		assertTrue(this.excursion.getUsuariosEspera().contains(usuario3));
		assertTrue(this.excursion.getEstado() instanceof Ocupada);
	}

}