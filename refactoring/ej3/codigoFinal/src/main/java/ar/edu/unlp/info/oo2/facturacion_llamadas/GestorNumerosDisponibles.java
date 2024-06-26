package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> numerosDisponibles;
	private GestorStrategy tipoGenerador;
	
	public GestorNumerosDisponibles() {
		this.numerosDisponibles  = new TreeSet<String>();
		this.tipoGenerador = new StrategyUltimo();
	}
	
	public SortedSet<String> getNumerosDisponibles() {
		return numerosDisponibles;
	}

	public String obtenerYOcuparNumeroDisponible() {
		return this.tipoGenerador.obtenerNumero(this.numerosDisponibles);
	}

	public void cambiarTipoGenerador(GestorStrategy tipoGenerador) {
		this.tipoGenerador = tipoGenerador;
	}
	
	public boolean agregarNumeroTelefono(String numeroTelefono) {
		return this.numerosDisponibles.add(numeroTelefono);
	}
	
}
