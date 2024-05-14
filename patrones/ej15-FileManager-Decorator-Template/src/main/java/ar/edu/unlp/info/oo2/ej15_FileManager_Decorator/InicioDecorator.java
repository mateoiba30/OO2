package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

public class InicioDecorator extends Decorator{
	
	public InicioDecorator(FileManager component) {
		super(component);
	}
	
	public String miImpresion() {
		return this.getFechaInicio();
	}

}
