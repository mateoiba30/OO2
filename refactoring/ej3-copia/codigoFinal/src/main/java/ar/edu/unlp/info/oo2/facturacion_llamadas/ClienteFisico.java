package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {

	private String dni;
	
	public ClienteFisico (String nombre, String dni) {
		super(nombre);
		this.dni = dni;
	}
	
	public double getDescuento() {
		return 0;
	}
}
