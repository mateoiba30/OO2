package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;
import java.time.DayOfWeek;

public class ConjuntoTramoAsiento {

	private int asientoAsignado;
	private Tramo tramo;
	
	public ConjuntoTramoAsiento(int asientoAsignado, Tramo tramo) {
		this.asientoAsignado = asientoAsignado;
		this.tramo = tramo;
	}
	
	public DayOfWeek getDiaSalida() {
		return this.tramo.getDiaSalida();
	}
	
	public double getCostoBase() {
		return this.tramo.getCostoBase();
	}
	
	public String getOrigen() {
		return this.tramo.getOrigen();
	}
	
	public String getDestino() {
		return this.tramo.getDestino();
	}
}
