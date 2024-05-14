package ar.edu.unlp.info.oo2.ej16_Meteorologia_Decorator;

public class PromedioDatos extends Decorator{

	public PromedioDatos(WeatherDataInterface componente) {
		super(componente);
	}
	
	public String informacion() {
		return " Promedio: " + Math.ceil(this.getTemperaturas().stream().mapToDouble(t -> (double)t).average().orElse(0));
	}
}
