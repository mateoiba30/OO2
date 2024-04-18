package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

public abstract class Decorator implements FileManager {

	private FileManager component;
	
	public Decorator(FileManager component) {
		this.component = component;
	}
	
	public String getNombre() {
		return this.component.getNombre();
	}

	public String getExtension() {
		return this.component.getExtension();
	}

	public String getTamanio() {
		return this.component.getTamanio();
	}

	public String getFechaInicio() {
		return this.component.getFechaInicio();
	}

	public String getFechaModificacion() {
		return  this.component.getFechaModificacion();
	}

	public String getPermisos() {
		return this.component.getPermisos();
	}
	
	public String prettyPrint() {
		return this.component.prettyPrint() + " " + miImpresion(); //todos los componentes imprimen lo suyo y lo de su "hijo" componente
	}
	
	public abstract String miImpresion();
	
}
