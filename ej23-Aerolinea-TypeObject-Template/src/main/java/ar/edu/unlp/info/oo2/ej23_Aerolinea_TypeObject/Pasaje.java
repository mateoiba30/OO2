package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;

import java.util.List;

public class Pasaje extends Servicio {
	
	private double rateRoundtrip = 0.95;
	private Persona persona;
	
	public Pasaje(int id, Persona persona, Aerolinea aerolinea, List<ConjuntoTramoAsiento> conjuntosTramoAsiento) {
		super(id, aerolinea, conjuntosTramoAsiento);
		this.persona = persona;
	}

	public double costoBase() {
		return this.getConjuntosTramoAsiento().stream().mapToDouble(c -> c.getCostoBase()).sum();
	}
	
	public double descuentoExtra() {
		if (this.inicioIgualFinal())
			return this.rateRoundtrip;
		return 1;
	}
	
	private boolean inicioIgualFinal() {
		int tamanio = getConjuntosTramoAsiento().size();
		return (tamanio >1) && ( this.getConjuntosTramoAsiento().get(0).getOrigen() == this.getConjuntosTramoAsiento().get(tamanio-1).getDestino() );
	}
}
