package ar.edu.unlp.info.oo2.e1_twitter;

public class Tweet extends Posteo{
	private String texto;
	
	public Tweet(String texto) {
		this.texto = recortar(texto);
	}
	
	public Posteo getOrigen() {
		return null;
	}

	private String recortar(String texto) {
		if (texto.length() > 280) 
			texto = texto.substring(0, 280);
		else 
			if( texto.length() == 0) 
				texto = " ";
		return texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
}
