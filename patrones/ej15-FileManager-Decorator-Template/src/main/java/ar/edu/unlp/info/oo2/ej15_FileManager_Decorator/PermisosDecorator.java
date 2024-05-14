package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

public class PermisosDecorator extends Decorator{
	
	public PermisosDecorator(FileManager component) {
		super(component);
	}
	
	public String miImpresion() {
		return this.getPermisos();
	}

}
