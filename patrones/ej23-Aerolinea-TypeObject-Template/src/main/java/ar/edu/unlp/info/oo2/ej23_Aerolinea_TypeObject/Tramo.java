package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class Tramo {

	private LocalDate salida;
	private LocalDate llegada;
	private double costoBasico; //no depende del tipo porque tal vez otro día de la semana sale diferente costo
	private TipoTramo tipo;
	private Avion avion;
	private double duracionHoras;
	
	public Tramo(LocalDate salida, LocalDate llegada, double costoBasico, TipoTramo tipo, Avion avion, double duracionHoras) {
		super();
		this.salida = salida;
		this.llegada = llegada;
		this.costoBasico = costoBasico;
		this.tipo = tipo;
		this.avion = avion;
	}
	
	public DayOfWeek getDiaSalida() {
		return this.salida.getDayOfWeek();
	}
	
	public double getCostoBase() {
		return this.costoBasico;
	}
	
	public String getOrigen() {
		return this.tipo.getOrigen();
	}
	
	public String getDestino() {
		return this.tipo.getDestino();
	}
	
	public double getPorcentajeOcupacion() {
		return this.avion.getPorcentajeOcupacion();
	}
	
	public boolean enPeriodo(DateLapse periodo) {
		return (periodo.includesDate(this.salida)) && (periodo.includesDate(this.llegada));
	}
	
	public double getDuracionHoras() { //asumo que un viaje siempre va a cumplir con el tiempo de vuelvo esperado
		return this.tipo.getDuracionHoras();
	}
	
	public boolean hayAsientosDisponibles() {
		return this.avion.hayAsientosDisponibles();
	}
	
	public boolean hayCargaDisponible() {
		return this.avion.hayCargaDisponible();
	}
	
	public int asignarAsiento() {
		return this.avion.asignarAsiento();
	}
	
	public void agergarPaquete(Paquete paquete) {
		this.avion.agergarPaquete(paquete);
	}
	
	public String getCodigoTramo() {
		return this.tipo.getCodigoTramo();
	}
	
}
