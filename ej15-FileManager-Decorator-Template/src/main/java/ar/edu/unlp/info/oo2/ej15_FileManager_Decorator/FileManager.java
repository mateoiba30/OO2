package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

public interface FileManager {

	public String prettyPrint();
	
	public String getNombre();
	public String getExtension();
	public String getTamanio();
	public String getFechaInicio();
	public String getFechaModificacion();
	public String getPermisos();
}
