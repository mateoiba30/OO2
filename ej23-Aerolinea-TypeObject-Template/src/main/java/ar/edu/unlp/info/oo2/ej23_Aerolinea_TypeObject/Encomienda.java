package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;

import java.util.List;

public class Encomienda extends Servicio{

	private Paquete paquete;
	
	public Encomienda(Paquete paquete, Aerolinea aerolinea, List<DiccionarioTramoAsiento> diccTramoAsientos) {
		super(aerolinea, diccTramoAsientos);
		this.paquete = paquete;
	}

	public double costoBase() {
		return this.paquete.costoBase();
	}
	
	public double descuentoExtra() {
		return 1;
	}
}