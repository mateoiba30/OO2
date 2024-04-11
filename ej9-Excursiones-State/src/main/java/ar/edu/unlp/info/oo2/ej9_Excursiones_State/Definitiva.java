package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

public class Definitiva extends Estado {

	public Definitiva(Excursion excursion) {
		super(excursion);
	}
	
	public boolean inscribirUsuario() {
		if(this.pasarAOcupada())
			this.setEstado(new Ocupada(this.getExcursion()));
		return true;
	}
	
	public String obtenerInformacion() {
		return this.getNombre() + this.getCostoString() + this.getFechaInicioString() + this.getFechaFinString() + this.getEncuentro() + this.getMailsString() + this.getUsuariosRestantesMinimosString();
		}
}