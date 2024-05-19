package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public abstract class GestorStrategy {
	
	public String eliminarYDevolverLinea(SortedSet<String> lineas) {
		String linea;
		linea = obtenerLinea(lineas);
		lineas.remove(lineas.last());
		return linea;
	}
	
	public abstract String obtenerLinea(SortedSet<String> lineas);
}
