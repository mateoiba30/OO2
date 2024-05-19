package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public abstract class GestorStrategy {
	
	public String obtenerYOcuparNumeroLibre(SortedSet<String> lineas) {
		String linea;
		linea = obtenerNumero(lineas);
		lineas.remove(lineas.last());
		return linea;
	}
	
	public abstract String obtenerNumero(SortedSet<String> lineas);
}
