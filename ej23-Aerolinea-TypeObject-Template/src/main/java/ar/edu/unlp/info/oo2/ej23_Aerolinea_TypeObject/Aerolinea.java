package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;
import java.time.DayOfWeek;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Aerolinea {

	private RatesDiarios ratesDiarios;
	private List<Tramo> tramosPosibles;
	private List<Avion> aviones;
	private List<Servicio> serviciosVendidos;
	
	public Aerolinea(RatesDiarios ratesDiarios, List<Tramo> tramosPosibles, List<Avion> aviones, List<Servicio> serviciosVendidos) {
		this.ratesDiarios = ratesDiarios;
		this.tramosPosibles = tramosPosibles;
		this.serviciosVendidos = serviciosVendidos;
	}
	
	public Pasaje emitirPasaje(List<Tramo> tramos, Persona pasajero) throws Exception {
		List<ConjuntoTramoAsiento> conjuntos = new ArrayList<>();

		for(Tramo tramo : tramos)
			conjuntos.add(this.comprarAsiento(tramo));
			
		/*
		tramos.stream().map(t -> {
			try {
				return this.comprarAsiento(t);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}).collect(Collectors.toList());
		*/
		
		return new Pasaje(this.serviciosVendidos.size(), pasajero, this, conjuntos);
	}
	
	private ConjuntoTramoAsiento comprarAsiento(Tramo tramo) throws Exception {
		if (tramo.hayAsientosDisponibles())
			return new ConjuntoTramoAsiento(tramo.asignarAsiento(), tramo);
		throw new Exception("No hay asientos libres en el vuelo "+tramo.getCodigoTramo());
	}
	
	//no hago los siguientes métodos por falta de tiempo
	/*
	
	public void modificarPasaje(int id, List<ConjuntoTramoAsiento> conjuntosTramoAsiento) { //falta que actualice los asientos y carga de los tramos que antes tenía y de los nuevos
		Servicio pasaje = buscarPasaje(id);
		if (pasaje != null)
			pasaje.setConjuntosTramoAsiento(conjuntosTramoAsiento);
	}
	
	public void cancelarPasaje(int id) { ////falta que actualice los asientos y carga de los tramos que antes tenía
		this.serviciosVendidos = this.serviciosVendidos.stream().filter(s -> ! s.idIgualA(id)).collect(Collectors.toList());;
	}
	
	
	private Servicio buscarPasaje(int id) {
		return this.serviciosVendidos.stream().filter(s -> s.idIgualA(id)).findFirst().orElse(null);
	}
	*/
	
	public double montoDescuentosTripHop() {
		return this.serviciosVendidos.stream().mapToDouble(s -> s.descuentoTripHop()).sum();
	}
	
	public double eficienciaTarifas() {
		double facturadoTotal = this.serviciosVendidos.stream().mapToDouble(s -> s.calcularPrecioFinal()).sum();
		double costosBasicosTotal = this.serviciosVendidos.stream().mapToDouble(s -> s.costoBase()).sum();
		return facturadoTotal / costosBasicosTotal;
	}
	
	public double getRateDiario(DayOfWeek dia) {
		return this.ratesDiarios.getRateDiario(dia);
	}
	
	public List<Double> promedioOcupacionTramosEnPeriodo(DateLapse periodo){
		return this.tramosPosibles.stream().filter(t -> t.enPeriodo(periodo)).map(t -> t.getPorcentajeOcupacion()).collect(Collectors.toList());
	}
	
	public List<Double> horasVoladasTotalesAviones(){
		return this.aviones.stream().map(a -> a.getHorasVoladasTotales()).collect(Collectors.toList());
	}
	
	public List<Double> horasVoladasPeriodoAviones(DateLapse periodo){
		return this.aviones.stream().map(a -> a.getHorasVoladasPeriodo(periodo)).collect(Collectors.toList());
	}
}
