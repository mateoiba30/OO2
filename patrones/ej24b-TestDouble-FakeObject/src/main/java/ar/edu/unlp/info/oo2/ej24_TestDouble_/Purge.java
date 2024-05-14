package ar.edu.unlp.info.oo2.ej24_TestDouble_;

public class Purge extends ProcessStep {
	
	public Purge(boolean result) {
		super(result);
	}

	public boolean basicExecute(MixingTank tank) {
		if (tank.upTo() == 0) {
			return false;
		}
		else {
			tank.heatPower(0);
			tank.mixerPower(0);
			tank.purge();

			try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			if (tank.upTo() != 0){
				return false;
			}
			return true;
		}
	}
}
