package ar.edu.unlp.info.oo2.ej16_Meteorologia_Decorator;

import java.util.List;
import java.util.Arrays;

public class HomeWeatherStation implements WeatherDataInterface {

	public HomeWeatherStation() {
		
	}
	
	public double getTemperatura() {
		return 86;
	}
	
	public double getPresion() {
		return 1008;
	}
	
	public double getRadiacionSolar() {
		return 200;
	}
	
	public List<Double> getTemperaturas(){
		return Arrays.asList(80.0, 91.0);
	}
	
	public String displayData() {
		return "Temperatura F: " + this.getTemperatura() +
			   	  " Presion atmosf: " + this.getPresion() +
			   	  " Radiacion solar: " + this.getRadiacionSolar();
	}
}
