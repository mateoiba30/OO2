package ar.edu.unlp.info.oo2.ej12_Dispositivo_Strategy;

public class AdapterConexion4G implements Conexion{

	private Conexion4G conexion4G;
		
	public AdapterConexion4G(String pict) {
		this.conexion4G = new Conexion4G(pict);
	}
	
	public String pict() {
		return this.conexion4G.symb();
	}
	
	public String sendData(String data, int crc) {
		return this.conexion4G.transmit(data, crc);
	}
}
