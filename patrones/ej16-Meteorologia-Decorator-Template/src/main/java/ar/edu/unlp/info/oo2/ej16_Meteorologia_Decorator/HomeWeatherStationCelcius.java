package ar.edu.unlp.info.oo2.ej16_Meteorologia_Decorator;

import java.util.List;
import java.util.stream.Collectors;

public class HomeWeatherStationCelcius extends HomeWeatherStation{

	public HomeWeatherStationCelcius() {
		
	}
	
	@Override
	public double getTemperatura() {
		return Math.ceil(( super.getTemperatura() - 32 ) / 1.8);
	}
	
	@Override
	public List<Double> getTemperaturas(){
		return super.getTemperaturas().stream().map((t -> Math.ceil((t - 32) / 1.8 ))).collect(Collectors.toList());
	}
	
	@Override
	public String displayData() {
		return "Temperatura C: " + this.getTemperatura() +
			   	  " Presion atmosf: " + this.getPresion() +
			   	  " Radiacion solar: " + this.getRadiacionSolar();
	}
}
