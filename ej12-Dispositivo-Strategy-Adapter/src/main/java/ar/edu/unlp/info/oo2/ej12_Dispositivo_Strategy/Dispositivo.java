package ar.edu.unlp.info.oo2.ej12_Dispositivo_Strategy;

public class Dispositivo {
	
	private Calculator calculator;
	private Ringer ringer;
	private Display display;
	private Conexion conexion;
	
	public Dispositivo() {
		
	}
	
	public Dispositivo(Conexion conexion, Calculator calculator, Ringer ringer, Display display) {
		this.conexion = conexion;
		this.calculator= calculator;
		this.ringer = ringer;
		this.display = display;
	}
	
	public String send(String data) {
		int crcNum = this.calculator.crcFor(data);
		return this.conexion.sendData(data, crcNum);
	}
	
	public String setConexion(Conexion conexion) {
		this.conexion = conexion;
		this.ringer.ring();
		return this.display.showBanner(this.conexion.pict());
	}
	
	public String setCalculator(Calculator calculator) {
		this.calculator = calculator;
		return "crc calculator changed";
	}
	
}
