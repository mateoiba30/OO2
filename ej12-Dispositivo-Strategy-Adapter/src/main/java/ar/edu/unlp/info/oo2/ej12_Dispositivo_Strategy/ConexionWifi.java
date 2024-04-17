package ar.edu.unlp.info.oo2.ej12_Dispositivo_Strategy;

public class ConexionWifi implements Conexion{

	private String pict;
	
	public ConexionWifi(String pict) {
		this.pict = pict;
	}
	
	public String sendData(String data, int crc) {
		return "Wifi: " + data + " " + String.valueOf(crc);
	}
	
	public String pict() {
		return this.pict;
	}
	
}
