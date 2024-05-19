package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class StrategyPrimero extends GestorStrategy{

	public String obtenerNumero(SortedSet<String> lineas) {
		return lineas.first();
	}
}
