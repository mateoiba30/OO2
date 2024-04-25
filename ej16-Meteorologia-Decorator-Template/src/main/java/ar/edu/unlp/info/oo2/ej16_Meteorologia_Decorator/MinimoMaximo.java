package ar.edu.unlp.info.oo2.ej16_Meteorologia_Decorator;

public class MinimoMaximo extends Decorator{

	public MinimoMaximo(WeatherDataInterface componente) {
		super(componente);
	}
	
	public String informacion() {
		return " Minimo " + this.getTemperaturas().stream().min((a1, a2)-> Double.compare(a1, a2)).orElse(null) +
				" Maximo " + this.getTemperaturas().stream().max((a1, a2)-> Double.compare(a1, a2)).orElse(null);
	}
}
