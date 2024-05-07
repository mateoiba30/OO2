package ar.edu.unlp.info.oo2.ej24_TestDouble_;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLightMix {

	private MixingTank tank0;
	private MixingTank tank15;
	private ProcessStep lightMix;
	
	@BeforeEach
	public void setUp() {
		this.tank0 = new MixingTank(0, 0);
		this.tank15 = new MixingTank(15, 15);
		this.lightMix = new LightMix(false);
	}
	
	@Test
	public void testBasicExecute() {
		assertTrue(lightMix.basicExecute(tank0));
		assertFalse(lightMix.basicExecute(tank15));
	}
}
