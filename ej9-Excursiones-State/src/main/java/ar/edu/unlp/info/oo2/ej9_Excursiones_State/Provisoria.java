package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

public class Provisoria extends Estado {

	public Provisoria(Excursion excursion) {
		super(excursion);
	}
	
	public boolean inscribirUsuario() {
		if(this.pasarADefinitiva())
			this.setEstado(new Definitiva(this.getExcursion()));
		return true;
	}
	
	public String obtenerInformacion() {
		return this.getNombre() + this.getCostoString() + this.getFechaInicioString() + this.getFechaFinString() + this.getEncuentro() + this.getUsuariosRestantesMinimosString();
	}
}
