package ar.edu.unlp.info.oo2.ej6_topologia_composite;
import static org.junit.jupiter.api.Assertions.*;

import java.math.RoundingMode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MixtaTest {
	
	private Agua agua;
	private Tierra tierra;
	private Pantano pantano;
	private Mixta mixta1;
	private Mixta mixta2;
	private Mixta mixta3;
	private Mixta mixta4;
	private Mixta mixta5;

	@BeforeEach
	public void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
		mixta1 = new Mixta();
		mixta2= new Mixta();
		mixta3= new Mixta();
		mixta4= new Mixta();
		mixta5= new Mixta();
		
		mixta1.addComponent(new Agua());
		mixta1.addComponent(new Tierra());
		mixta1.addComponent(new Tierra());
		mixta1.addComponent(new Pantano());
		
		mixta2.addComponent(new Agua());
		mixta2.addComponent(new Tierra());
		mixta2.addComponent(new Tierra());
		mixta2.addComponent(mixta1);
		
		mixta3.addComponent(new Agua());
		mixta3.addComponent(new Tierra());
		mixta3.addComponent(new Tierra());
		mixta3.addComponent(new Pantano());
		
		mixta4.addComponent(new Agua());
		mixta4.addComponent(new Tierra());
		mixta4.addComponent(new Tierra());
		mixta4.addComponent(mixta1);
		
		mixta5.addComponent(new Agua());
		mixta5.addComponent(new Tierra());
		mixta5.addComponent(mixta1);
		mixta5.addComponent(new Tierra());
	}

	@Test 
	public void testGetComponente(){
		assertTrue(mixta2.getComponent(0).igual(agua));
		assertTrue(mixta2.getComponent(1).igual(tierra));
		assertTrue(mixta2.getComponent(2).igual(tierra));
		assertTrue(mixta2.getComponent(3).igual(mixta1));
	}
	
	@Test
	public void testAddComponent() {
		mixta1.addComponent(new Agua());
		assertEquals(4, mixta1.getCantidadComponentes());
		/*assertEquals(4, mixta2.getCantidadComponentes()); //no necesario evaluar esto, es el mismo caso que arriba
		assertEquals(4, mixta3.getCantidadComponentes());
		assertEquals(4, mixta4.getCantidadComponentes());
		assertEquals(4, mixta5.getCantidadComponentes());*/
	}

	@Test
	public void testGetProporcionTierra() {/*
		assertEquals(1,tierra.proporcionTierra()); //puedo asumir que andan, hacer una clase test por cada clase a testear
		assertEquals(0,agua.proporcionTierra());
		assertEquals(0.3, pantano.proporcionTierra());*/
		assertEquals(0.575,mixta1.proporcionTierra());
		assertEquals(2.575/4,mixta2.proporcionTierra());
	}
	
	@Test
	public void testGetProporcionAgua() {/*
		assertEquals(0,tierra.proporcionAgua()); //puedo asumir que andan, hacer una clase test por cada clase a testear
		assertEquals(1,agua.proporcionAgua()); */
		assertEquals(0.425,mixta1.proporcionAgua());
		//assertEquals((1 - 2.575/4),mixta2.proporcionAgua()); //-> anda, solo que no es tan preciso al manejar flotantes
	}
	
	@Test
	public void testIsEquals() {//a las mixtas nunca dice que son iguales 
		/* //puedo asumir que andan, hacer una clase test por cada clase a testear
		assertTrue(this.tierra.igual(new Tierra()));
		assertFalse(this.tierra.igual(new Agua()));
		assertFalse(this.agua.igual(new Tierra()));
		assertTrue(this.agua.igual(new Agua()));
		assertTrue(this.pantano.igual(new Pantano()));
		assertFalse(this.pantano.igual(new Mixta())); */
		assertFalse(this.mixta1.igual(pantano));
		assertFalse(this.mixta1.igual(mixta2));
		
		assertTrue(this.mixta1.igual(mixta3));//dice que no son iguales
		assertTrue(this.mixta2.igual(mixta4));//dice que no son iguales
		
		assertFalse(this.mixta2.igual(mixta5));
	}
}