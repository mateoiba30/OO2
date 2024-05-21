package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes;
	private List<Llamada> llamadas;
	private GestorNumerosDisponibles gestor;
	
	public Empresa() {
		this.clientes = new ArrayList<Cliente>();
		this.llamadas = new ArrayList<Llamada>();
		this.gestor = new GestorNumerosDisponibles();
	}
	
	public boolean agregarNumeroTelefono(String str) {
		return this.gestor.agregarNumeroTelefono(str);
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

	public Llamada registrarLlamada(Cliente origen, Cliente destino, Llamada llamada) {
		llamada.setOrigen(origen.getNumeroTelefono());
		llamada.setDestino(destino.getNumeroTelefono());
		
		llamadas.add(llamada);
		origen.agregarLlamada(llamada);
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
