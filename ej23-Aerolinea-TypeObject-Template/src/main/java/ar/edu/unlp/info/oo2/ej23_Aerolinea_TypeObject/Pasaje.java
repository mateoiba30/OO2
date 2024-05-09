package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;

import java.util.List;

public class Pasaje extends Servicio {
	
	private double rateRoundtrip = 0.95;
	private Persona persona;
	
	public Pasaje(Persona persona, Aerolinea aerolinea, List<DiccionarioTramoAsiento> diccTramoAsientos) {
		super(aerolinea, diccTramoAsientos);
		this.persona = persona;
	}

	public double costoBase() {
		return this.getConjuntosTramoAsientos().sumarCostosBase();
	}
	
	public double descuentoExtra() {
		if (this.getConjuntosTramoAsientos().comienzoIgualFinal())
			return this.rateRoundtrip;
		return 1;
	}
}
