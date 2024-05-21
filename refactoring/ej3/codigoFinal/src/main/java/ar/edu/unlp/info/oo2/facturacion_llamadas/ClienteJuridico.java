package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {

	private String cuit;
	
	public ClienteJuridico (String nombre, String cuit) {
		super(nombre);
		this.cuit = cuit;
	}
	
	public double getDescuento() {
		return 0.15;
	}
}
