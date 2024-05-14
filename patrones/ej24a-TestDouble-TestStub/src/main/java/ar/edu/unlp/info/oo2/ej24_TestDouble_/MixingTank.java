package ar.edu.unlp.info.oo2.ej24_TestDouble_;

public class MixingTank {
	
	public MixingTank() {
		
	}

	public boolean heatPower(int percentage) {
		/*if (percentage < 0 || percentage > 100)
			return false;*/
		return true;
	}
	
	public boolean mixerPower(int percentage) {
		/*if (percentage < 0 || percentage > 100)
		return false;*/
		return true;
	}
	
	public boolean purge() { //en ningún caso quiero simular que falle
		return true;
	}
}
