package ar.edu.unlp.info.oo2.ej12_Dispositivo_Strategy;

public interface Conexion {
	
	public String sendData(String data, int crc);
	
	public String pict();
}
