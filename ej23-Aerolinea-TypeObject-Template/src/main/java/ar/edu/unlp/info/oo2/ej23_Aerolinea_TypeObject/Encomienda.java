package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;

import java.util.List;

public class Encomienda extends Servicio{

	private Paquete paquete;
	
	public Encomienda(int id, Paquete paquete, Aerolinea aerolinea, List<ConjuntoTramoAsiento> diccTramoAsientos) {
		super(id, aerolinea, diccTramoAsientos);
		this.paquete = paquete;
	}

	public double costoBase() {
		return this.paquete.getCostoBase();
	}
	
	public double descuentoExtra() {
		return 1;
	}
}