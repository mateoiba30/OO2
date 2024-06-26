package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;
import java.util.List;

public abstract class Servicio {
	
	private int id;
	private double rateMultihop = 0.93;
	private Aerolinea aerolinea;
	private List<ConjuntoTramoAsiento> conjuntosTramoAsiento;
	
	
	public Servicio(int id, Aerolinea aerolinea, List<ConjuntoTramoAsiento> conjuntoTramoAsientos) {
		this.aerolinea = aerolinea;
		this.conjuntosTramoAsiento = conjuntoTramoAsientos;
		this.id = id;
	}
	
	public double calcularPrecioFinal() {
		return (this.costoBase() - this.descuentoTripHop()) * this.descuentoExtra();
	}

	public double descuentoTripHop() {
		return this.costoBase() - this.costoBase() * this.calcularRateDiario() * this.calcularRateMultihop(); //al hacerlo de esta forma me facilita el método montoDescuentosTripHop en la aerolinea
	}
	
	public double calcularRateMultihop() {
		if (this.conjuntosTramoAsiento.size() >= 3) //en la vida real puede tener 4 tramos, pero que un destino se repita y que no haya descuento por RateMultihop. Yo lo voy a simplificar de todas formas
			return rateMultihop;
		return 1;
	}
	
	public double calcularRateDiario() {
		return this.aerolinea.getRateDiario( this.conjuntosTramoAsiento.get(0).getDiaSalida() ); //un pasaje de muchas escalas elige el rate diario de la fecha de salida del primer pasaje
	}
	
	public abstract double costoBase();
	
	public abstract double descuentoExtra();
	
	public List<ConjuntoTramoAsiento> getConjuntosTramoAsiento(){
		return this.conjuntosTramoAsiento;
	}
	
	public boolean idIgualA(int id) {
		return this.id == id;
	}
	
	public void setConjuntosTramoAsiento(List<ConjuntoTramoAsiento> conjuntoTramoAsientos){
		this.conjuntosTramoAsiento = conjuntoTramoAsientos;
	}
}
