package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

import java.time.LocalDate;

public abstract class Estado {
	
	public Estado() {

	}
	
	public String obtenerInformacion(Excursion excursion) {
		String result = excursion.getNombre() + excursion.getCostoString() + excursion.getFechaInicioString() + excursion.getFechaFinString() + excursion.getEncuentro();
		result += agregarInformacion(excursion);
		return result;
	}
	
	public abstract String agregarInformacion(Excursion excursion);
	
	public abstract boolean inscribirUsuario(Excursion excursion);
	
	public void setEstado(Excursion excursion, Estado estado) {
		excursion.setEstado(estado);
	}
//	
//	public boolean pasarADefinitiva(Excursion excursion) {
//		return excursion.pasarADefinitiva();
//	}
//	
//	public boolean pasarAOcupada(Excursion excursion) {
//		return excursion.pasarAOcupada();
//	}
	
	public String getNombre(Excursion excursion) {
		return excursion.getNombre();
	}
	
	public String getEncuentro(Excursion excursion) {
		return excursion.getEncuentro();
	}
	
	public Excursion getExcursion(Excursion excursion) {
		return excursion;
	}

}
