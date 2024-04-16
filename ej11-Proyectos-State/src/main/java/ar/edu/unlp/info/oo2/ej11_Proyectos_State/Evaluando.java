package ar.edu.unlp.info.oo2.ej11_Proyectos_State;

public class Evaluando implements Estado {
	
	public Evaluando() {
		
	}
	
	public void aprobarEtapa(Proyecto proyecto) {
		proyecto.setEstado(new Confirmado());
	}
	
	public boolean modificarMargenGanancias(Proyecto proyecto, double nuevoMargen) {
//		return proyecto.margenDeGananciaEntre(0.11, 0.15);
		return (nuevoMargen > 0.11 && nuevoMargen < 0.15);
	}
	
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setEstado(new Cancelado());
		proyecto.setObjetivo(" (Cancelado) ");
	}
}
