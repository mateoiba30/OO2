package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes;
	private GestorNumerosDisponibles gestor;
	
	public Empresa() {
		this.clientes = new ArrayList<Cliente>();
		this.gestor = new GestorNumerosDisponibles();
	}
	
	public boolean agregarNumeroTelefono(String numeroTelefono) {
		return this.gestor.agregarNumeroTelefono(numeroTelefono);
	}

	public String obtenerYOcuparNumeroDisponible() {
		return gestor.obtenerYOcuparNumeroDisponible();
	}
	
	public GestorNumerosDisponibles getGestorNumeros() {
		return this.gestor;
	}
	
	public Cliente registrarUsuario(Cliente cliente) {
		String tel = this.obtenerYOcuparNumeroDisponible();
		cliente.setNumeroTelefono(tel);	
		clientes.add(cliente);
		return cliente;
	}

	public Llamada registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion) {
		Llamada llamada = new LlamadaNacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		return guardarYDevolverLlamada(origen, llamada);
	}

	public Llamada registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		Llamada llamada = new LlamadaInternacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		return guardarYDevolverLlamada(origen, llamada);
	}
	
	private Llamada guardarYDevolverLlamada(Cliente cliente, Llamada llamada) {
		cliente.agregarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.getLlamadas().stream().mapToDouble(llamada -> llamada.precioFinal(cliente)).sum();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}
}
