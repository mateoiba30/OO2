package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {

	private String cuit;
	private final double descuentoJur = 0.15;
	
	public void setData(String data) {
		this.cuit = data;
	}
	
	public double getDescuento() {
		return this.descuentoJur;
	}
}
