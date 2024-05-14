package ar.edu.unlp.info.oo2.ej10_encriptador_strategy;

public class ConexionSegura extends Conexion {

	private Encriptador encriptador;
	
	public ConexionSegura(Encriptador encriptador) { //elijo la forma de encriptar
		this.encriptador = encriptador;
	}
	
	public String enviarMensaje(String mensaje) {
		return this.encriptador.encriptar(mensaje);
	}
}
