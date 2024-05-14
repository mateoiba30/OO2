package ar.edu.unlp.info.oo2.ej11_Proyectos_State;

public class Construyendo implements Estado {
	
	public Construyendo() {
		
	}
	
	public void aprobarEtapa(Proyecto proyecto) {
		if (!proyecto.precioCero())
			proyecto.setEstado(new Evaluando());
		else
			throw new RuntimeException("No se puede aprobar un proyecto de precio 0");
	}
	
	public boolean modificarMargenGanancias(Proyecto proyecto, double nuevoMargen) {
//		return (proyecto.margenDeGananciaEntre(0.08, 0.10));
		return nuevoMargen > 0.8 && nuevoMargen<0.10;
	}
	
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setEstado(new Cancelado());
		proyecto.setObjetivo(" (Cancelado) ");
	}
}
