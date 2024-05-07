package ar.edu.unlp.info.oo2.ej24_TestDouble_;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPurge {

	private MixingTank tank ;
	private ProcessStep purge;
	
	@BeforeEach
	public void setUp() {
		this.tank = new MixingTank();
		this.purge = new Purge(false);
	}
	
	@Test
	public void testBasicExecute() {
		assertTrue(purge.basicExecute(tank));
	}
}
