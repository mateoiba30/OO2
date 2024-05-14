package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

public class TamanioDecorator extends Decorator{
	
	public TamanioDecorator(FileManager component) {
		super(component);
	}
	
	public String miImpresion() {
		return this.getTamanio();
	}

}
