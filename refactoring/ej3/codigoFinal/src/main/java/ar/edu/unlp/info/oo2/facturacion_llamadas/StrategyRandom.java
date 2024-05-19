package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class StrategyRandom extends GestorStrategy{

	public String obtenerNumero(SortedSet<String> lineas) {
		return new ArrayList<String>(lineas).get(new Random().nextInt(lineas.size()));
	}
}
