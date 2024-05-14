package ar.edu.unlp.info.oo2.ej11_Proyectos_State;

public interface Estado {
	
	public abstract void aprobarEtapa(Proyecto proyecto);
	
	public abstract boolean modificarMargenGanancias(Proyecto proyecto, double nuevoMargen);
	
	public abstract void cancelarProyecto(Proyecto proyecto);
}
