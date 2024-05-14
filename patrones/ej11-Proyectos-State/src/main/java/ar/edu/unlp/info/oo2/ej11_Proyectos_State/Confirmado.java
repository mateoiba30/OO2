package ar.edu.unlp.info.oo2.ej11_Proyectos_State;

public class Confirmado implements Estado {
	
	public Confirmado() {
		
	}
	
	public void aprobarEtapa(Proyecto proyecto) {
		
	}
	
	public boolean modificarMargenGanancias(Proyecto proyecto, double nuevoMargen) {
		return false;
	}
	
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setEstado(new Cancelado());
		proyecto.setObjetivo(" (Cancelado) ");
	}
}
