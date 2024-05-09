package ar.edu.unlp.info.oo2.ej24_TestDouble_;

public class LightMix extends ProcessStep {
	
	public LightMix(boolean result) {
		super(result);
	}

	public boolean basicExecute(MixingTank tank) {
		double temp = tank.temperature();
		tank.heatPower(100);
		
		
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		/*
		System.out.println(tank.temperature());//0 -> este es el que no anda
		System.out.println(temp);//0
		System.out.println(tank.temperature() - temp);//0
		*/
		
		if(Math.round(tank.temperature()-temp) == 10 ){
		   tank.mixerPower(5);
		   return true;
		}
		else {
		  return false;
		}
	}
}
