package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

public class Ocupada extends Estado {

	public Ocupada(Excursion excursion) {
		super(excursion);
	}
	
	public boolean inscribirUsuario() {
		return false;
	}
	
	public String obtenerInformacion() {
		return this.getNombre() + this.getCostoString() + this.getFechaInicioString() + this.getFechaFinString() + this.getEncuentro();
		}
}