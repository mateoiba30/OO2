package ar.edu.unlp.info.oo2.ej16_Meteorologia_Decorator;

import java.util.List;

public interface WeatherDataInterface{
	
	public double getTemperatura();
	public double getPresion();
	public double getRadiacionSolar();
	public List<Double> getTemperaturas();
	public String displayData();
	
}
