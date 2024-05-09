package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;

public class ConjuntoTramoAsiento {

	private int asientoAsignado;
	private Tramo tramo;
	
	public ConjuntoTramoAsiento(int asientoAsignado, Tramo tramo) {
		this.asientoAsignado = asientoAsignado;
		this.tramo = tramo;
	}
	
	public String getDiaSalida() {
		return this.tramo.getDiaSalida();
	}
}
