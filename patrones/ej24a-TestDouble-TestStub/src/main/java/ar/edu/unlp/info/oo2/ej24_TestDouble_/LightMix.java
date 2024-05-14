package ar.edu.unlp.info.oo2.ej24_TestDouble_;

public class LightMix extends ProcessStep {
	
	public LightMix(boolean result) {
		super(result);
	}

	public boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(20) && tank.mixerPower(5));
	}
}
