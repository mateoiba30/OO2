package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

public class ModificacionDecorator extends Decorator{
	
	public ModificacionDecorator(FileManager component) {
		super(component);
	}
	
	public String miImpresion() {
		return this.getFechaModificacion();
	}

}
