package ar.edu.unlp.info.oo2.ej11_Proyectos_State;

//import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
	
	public Proyecto(String nombre, LocalDate inicio, LocalDate fin, String objetivo, int nroIntegrantes,  List<Double> pagosDiarios) {
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.nroIntegrantes = nroIntegrantes;
		this.margenGanancias = 0.07;
		this.nombre = nombre;
		this.pagosDiarios = pagosDiarios;
		this.estado = new Construyendo();
	}
	
	public void aprobarEtapa() {
		this.estado.aprobarEtapa(this);
	}
	
	public double costoProyecto() {
		//return Duration.between(this.inicio, this.fin).toDays() * (this.pagosDiarios.stream().mapToDouble(p -> (double) p).sum());
		return ChronoUnit.DAYS.between(this.inicio,this.fin) * (this.pagosDiarios.stream().mapToDouble(p -> (double) p).sum());
	}
	
	public double precioProyecto() {
		return this.costoProyecto() * this.margenGanancias;
	}
	
	public void modificarMargenGanancias(double nuevoMargen) {
		if (this.estado.modificarMargenGanancias(this, nuevoMargen))
			this.margenGanancias = nuevoMargen;
	}
	
	public void cancelarProyecto() {
		this.estado.cancelarProyecto(this);
	}
	
	public boolean precioCero() {
		return this.precioProyecto() == 0;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

//	public boolean margenDeGananciaEntre(double inicio, double fin) {
//		return inicio < this.margenGanancias && this.margenGanancias < fin;
//	}
	
	public void setMargen(double nuevoMargen) {
		this.margenGanancias = nuevoMargen;
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getObjetivo() {
		return this.objetivo;
	}
	
	public Estado getEstado() {
		return this.estado;
	}

	public double getMargenGanancias() {
		return this.margenGanancias;
	}

}
