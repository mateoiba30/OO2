package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

import java.time.LocalDate;

public abstract class Estado {
	
	private Excursion excursion;
	
	public Estado(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public abstract String obtenerInformacion();
	
	public abstract boolean inscribirUsuario();
	
	public void setEstado(Estado estado) {
		this.excursion.setEstado(estado);
	}
	
	public boolean pasarADefinitiva() {
		return this.excursion.pasarADefinitiva();
	}
	
	public boolean pasarAOcupada() {
		return this.excursion.pasarAOcupada();
	}
	
	public String getNombre() {
		return this.excursion.getNombre();
	}
	
	public String getCostoString() {
		return String.valueOf(this.excursion.getCosto());
	}
	
	public String getFechaInicioString() {
		return String.valueOf(this.excursion.getFechaInicio());
	}
	
	public String getFechaFinString() {
		return String.valueOf(this.excursion.getFechaFin());
	}
	
	public String getEncuentro() {
		return this.excursion.getEncuentro();
	}
	
	public String getUsuariosRestantesMinimosString() {
		return String.valueOf(this.excursion.getUsuariosRestantesMinimos());
	}
	
	public Excursion getExcursion() {
		return this.excursion;
	}
	
	public String getMailsString() {
		return String.join(" ", this.excursion.getMails());
	}
}
