package ar.edu.unlp.info.oo2.e1_twitter;

public class Tweet implements Posteo{
	private String texto;
	
	public Tweet(String texto) {
		this.texto = recortarTexto(texto);
	}
	
	public Posteo getOrigen() {
		return null;
	}

	private String recortarTexto(String texto) {
		if (texto.length() > 280) 
			texto = texto.substring(0, 280);
		else 
			if( texto.length() == 0) 
				texto = " ";
		return texto;
	}
	
	public int getTextoLength() {
		return this.texto.length();
	}
	
}
