package ar.edu.unlp.info.oo2.ej10_encriptador_strategy;

public class Mensajero {
	
	private Conexion conexion;

	public Mensajero(Conexion conexion) { //acá se elige si la conexión debe ser segura u otro tipo de conexión
		this.conexion = conexion;
	}
	
	public String enviarMensaje(String mensaje) {
		return this.conexion.enviarMensaje(mensaje);
	}
}
