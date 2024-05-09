package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;
import java.util.Map;
import java.time.DayOfWeek;

public class RatesDiarios {
	
	private Map<DayOfWeek, Double> diccionarioValores;
	
	public RatesDiarios(Map<DayOfWeek, Double> diccionarioValores) {
		this.diccionarioValores = diccionarioValores;
	}
	
	public double getRateDiario(DayOfWeek dia) {
		return this.diccionarioValores.get(dia);
	}
}
