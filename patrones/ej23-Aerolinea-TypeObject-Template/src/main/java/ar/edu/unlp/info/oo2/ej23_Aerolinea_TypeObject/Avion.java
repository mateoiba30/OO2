package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Avion {

	private TipoAvion tipo;
	private List<Integer> asientosDisponibles;
	private double cargaDisponible;
	private List<Tramo> tramosHechos;
	
	public Avion(TipoAvion tipo) {
		this.tipo = tipo;
		this.asientosDisponibles = IntStream.rangeClosed(1, this.tipo.getCantidadAsientos()).boxed().collect(Collectors.toList());
		this.cargaDisponible = this.tipo.getCargaMaxima();
		this.tramosHechos = new ArrayList<>(); //asumo que la aerolinea solo adquiere aviones nuevos, sin tramos de antes
	}
	
	public boolean hayAsientosDisponibles() {
		return this.asientosDisponibles.size() > 0;
	}
	
	public boolean hayCargaDisponible() {
		return this.cargaDisponible > 0;
	}
	
	public int asignarAsiento() {
		return this.asientosDisponibles.remove(0);
	}
	
	public void agergarPaquete(Paquete paquete) {
		this.cargaDisponible -= paquete.getPeso();
	}
	
	public double getPorcentajeOcupacion() {
		return (1 - this.asientosDisponibles.size() / this.tipo.getCantidadAsientos()) * 100;
	}
	
	public void vaciarAvion() { //para prepararlo para un nuevo vuelo
		this.asientosDisponibles = IntStream.rangeClosed(1, this.tipo.getCantidadAsientos()).boxed().collect(Collectors.toList());
		this.cargaDisponible = this.tipo.getCargaMaxima();
	}
	
	public void volar(Tramo tramo) {
		this.tramosHechos.add(tramo);
	}
	
	public double getHorasVoladasTotales() {
		return this.tramosHechos.stream().mapToDouble(t -> t.getDuracionHoras()).sum();
	}
	
	public double getHorasVoladasPeriodo(DateLapse periodo) {
		return this.tramosHechos.stream().filter(t -> t.enPeriodo(periodo)).mapToDouble(t -> t.getDuracionHoras()).sum();
	}
}
