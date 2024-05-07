package ar.edu.unlp.info.oo2.ej24_TestDouble_;

public class MixingTank {
	
	private double temperature;
	private double upTo;
	
	public MixingTank(double temperature, double upTo) {
		this.temperature = temperature;
		this.upTo = upTo;
	}

	public boolean heatPower(int percentage, int delay) {
		/*if (percentage < 0 || percentage > 100)
			return false;*/
		switch (percentage) {
			case 100: this.temperature = 5 * delay; break;
			case 75: this.temperature = 4 * delay; break;
			case 50: this.temperature = 2 * delay; break;
			case 25: this.temperature = 1 * delay; break;
			case 0: this.temperature = 0 * delay; break;
		}

		return true;
	}
	
	public boolean mixerPower(int percentage) {
		/*if (percentage < 0 || percentage > 100)
		return false;*/
		return true;
	}
	
	public boolean purge() { //en ningún caso quiero simular que falle
		try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		this.upTo = 0;
		
		return true;
	}
	
	public double temperature() {
		return this.temperature;
	}
	
	public double upTo() {
		return this.upTo;
	}
	
}
