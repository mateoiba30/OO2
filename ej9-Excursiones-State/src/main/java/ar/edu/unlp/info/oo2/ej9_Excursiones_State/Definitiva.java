package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

public class Definitiva extends Estado {

	public Definitiva() {
	
	}
	
	public boolean inscribirUsuario(Excursion excursion) {
		if(excursion.pasarAOcupada())
			excursion.setEstado(new Ocupada());
		return true;
	}
	
	public String agregarInformacion(Excursion excursion) {
		return excursion.getUsuariosRestantesMinimosString();
	}
}