package ar.edu.unlp.info.oo2.ej11_Proyectos_State;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

public class Proyecto {

	private LocalDate inicio;
	private LocalDate fin;
	private String objetivo;
	private int nroIntegrantes;
	private double margenGanancias;
	private List<Double> pagosDiarios;
	private Estado estado;
	private String nombre;
	
	public Proyecto(LocalDate inicio, LocalDate fin, String objetivo, int nroIntegrantes, String nombre,  List<Double> pagosDiarios) {
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.nroIntegrantes = nroIntegrantes;
		this.margenGanancias = 7;
		this.nombre = nombre;
		this.pagosDiarios = pagosDiarios;
	}
	
	public void aprobarEtapa() {
		this.estado.aprobarEtapa(this);
	}
	
	public double costoProyecto() {
		return Duration.between(this.inicio, this.fin).toDays() * (this.pagosDiarios.stream().mapToDouble(p -> (double) p).sum());
	}
	
	public double precioProyecto() {
		return this.costoProyecto() * this.margenGanancias;
	}
	
	public void modificarMargenGanancias() {
		this.estado.modificarMargenGanancias(this);
	}
	
	public void cancelarProyecto() {
		this.estado.cancelarProyecto(this);
	}
	
	public boolean precioCero() {
		return this.precioProyecto() == 0;
	}
}
