package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles gestor = new GestorNumerosDisponibles();

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
