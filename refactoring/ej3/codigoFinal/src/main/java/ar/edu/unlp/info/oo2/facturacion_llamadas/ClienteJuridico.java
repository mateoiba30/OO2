package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {

	private String cuit;
	
	public void setData(String data) {
		this.cuit = data;
	}
	
	public double getDescuento() {
		return 0.15;
	}
}
