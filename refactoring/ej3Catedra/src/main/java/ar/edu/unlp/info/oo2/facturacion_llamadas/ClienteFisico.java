package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {

	private String dni;
	private final double descuentoFis = 0;
	
	public void setData(String data) {
		this.dni = data;
	}
	
	public double getDescuento() {
		return this.descuentoFis;
	}
}
