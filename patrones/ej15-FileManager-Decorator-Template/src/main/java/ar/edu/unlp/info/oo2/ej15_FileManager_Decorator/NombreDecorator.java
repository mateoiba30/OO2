package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

public class NombreDecorator extends Decorator{
	
	public NombreDecorator(FileManager component) {
		super(component);
	}
	
	public String miImpresion() {
		return this.getNombre();
	}

}
