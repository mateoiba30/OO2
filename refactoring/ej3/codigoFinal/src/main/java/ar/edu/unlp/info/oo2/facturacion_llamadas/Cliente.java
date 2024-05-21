package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private List<Llamada> llamadas;
	private String nombre;
	private String numeroTelefono;
	
	public Cliente(String nombre) {
        this.nombre = nombre;
        this.numeroTelefono = null;
        this.llamadas = new ArrayList<Llamada>();
    }
	
	public abstract double getDescuento();

	public List<Llamada> getLlamadas(){
		return this.llamadas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
}
