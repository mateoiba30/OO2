package ar.edu.unlp.info.oo2.ej11_Proyectos_State;

public interface Estado {
	
	public abstract void aprobarEtapa(Proyecto proyecto);
	
	public abstract void modificarMargenGanancias(Proyecto proyecto);
	
	public abstract void cancelarProyecto(Proyecto proyecto);
}
