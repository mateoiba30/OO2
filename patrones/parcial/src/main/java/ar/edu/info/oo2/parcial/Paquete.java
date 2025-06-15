package ar.edu.info.oo2.parcial;

public class Paquete implements Componente{
	private String descripcion;
	private String destinatario;
	private String direccionDestino;
	private double valorDeclarado;
	
	public Paquete(String descripcion, String destinatario, String direccionDestino, double valorDeclarado){
		this.descripcion = descripcion;
		this.destinatario = destinatario;
		this.direccionDestino = direccionDestino;
		this.valorDeclarado = valorDeclarado;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	public String getDestinatario(){
		return this.destinatario;
	}
	public String getDireccionDestinatario(){
		return this.direccionDestino;
	}
	public double getValorDeclarado(){
		return this.valorDeclarado;
	}
	public double getCostoEnvio(){
		return this.valorDeclarado * 0.05;
	}
	
}