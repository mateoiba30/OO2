package ar.edu.unlp.info.oo2.ej24_TestDouble_;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLightMix {

	private MixingTank tank ;
	private ProcessStep lightMix;
	
	@BeforeEach
	public void setUp() {
		this.tank = new MixingTank();
		this.lightMix = new LightMix(false);
	}
	
	@Test
	public void testBasicExecute() {
		assertTrue(lightMix.basicExecute(tank));
	}
}
