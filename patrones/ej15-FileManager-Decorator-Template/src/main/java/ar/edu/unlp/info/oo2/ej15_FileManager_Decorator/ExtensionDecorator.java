package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

public class ExtensionDecorator extends Decorator{
	
	public ExtensionDecorator(FileManager component) {
		super(component);
	}
	
	public String miImpresion() {
		return this.getExtension();
	}

}
