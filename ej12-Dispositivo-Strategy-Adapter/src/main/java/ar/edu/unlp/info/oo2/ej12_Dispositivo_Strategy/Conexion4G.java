package ar.edu.unlp.info.oo2.ej12_Dispositivo_Strategy;

public class Conexion4G {
	
	private String symb;
	
	public Conexion4G(String symb) {
		this.symb = symb;
	}
	
	public String symb() {
		return this.symb;
	}
	
	public String transmit(String data, int crc) {
		return "4G: " + data + " " + String.valueOf(crc);
	}
}
