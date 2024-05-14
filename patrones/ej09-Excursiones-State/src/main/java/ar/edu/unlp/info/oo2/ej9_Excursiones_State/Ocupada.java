package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

public class Ocupada extends Estado {

	public Ocupada() {
		
	}
	
	public boolean inscribirUsuario(Excursion excursion) {
		return false;
	}
	
	public String agregarInformacion(Excursion excursion) {
		return excursion.getUsuariosRestantesMaximosString()+ excursion.getMailsString();
		}
}