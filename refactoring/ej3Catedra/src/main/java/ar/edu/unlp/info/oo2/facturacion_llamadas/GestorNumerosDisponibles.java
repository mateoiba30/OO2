package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private GestorStrategy tipoGenerador = new StrategyUltimo();
	
	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return this.tipoGenerador.obtenerNumeroLibre(this.lineas);
	}

	public void cambiarTipoGenerador(GestorStrategy valor) {
		this.tipoGenerador = valor;
	}
}
