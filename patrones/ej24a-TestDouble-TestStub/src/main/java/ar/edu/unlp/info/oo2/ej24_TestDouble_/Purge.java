package ar.edu.unlp.info.oo2.ej24_TestDouble_;

public class Purge extends ProcessStep {
	
	public Purge(boolean result) {
		super(result);
	}

	public boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(0) && tank.mixerPower(0) && tank.purge());
	}
}
