package ar.edu.unlp.info.oo2.ej16_Meteorologia_Decorator;

import java.util.List;

public abstract class Decorator implements WeatherDataInterface {
	
	private WeatherDataInterface componente;
	
	public Decorator(WeatherDataInterface componente) {
		this.componente = componente;
	}
	
	public double getTemperatura() {
		return this.componente.getTemperatura();
	}
	
	public double getPresion() {
		return this.componente.getPresion();
	}
	
	public double getRadiacionSolar() {
		return this.componente.getRadiacionSolar();
	}
	
	public List<Double> getTemperaturas(){
		return this.componente.getTemperaturas();
	}
	
	public String displayData() {
		return this.componente.displayData() + informacion();
	}
	
	public abstract String informacion();
}
