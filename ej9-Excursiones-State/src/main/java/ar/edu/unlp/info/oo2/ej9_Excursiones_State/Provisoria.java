package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

public class Provisoria extends Estado {

	public Provisoria() {

	}
	
	public boolean inscribirUsuario(Excursion excursion) {
		if(excursion.pasarADefinitiva())
			excursion.setEstado(new Definitiva());
		return true;
	}
	
	public String agregarInformacion(Excursion excursion) {
		return excursion.getUsuariosRestantesMinimosString();
	}
}
