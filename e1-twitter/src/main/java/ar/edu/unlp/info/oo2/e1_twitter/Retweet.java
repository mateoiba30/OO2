package ar.edu.unlp.info.oo2.e1_twitter;

public class Retweet extends Posteo{
	private Posteo origen;
	
	public Retweet(Posteo origen) {
		this.origen = origen;
	}
	
	public Posteo getOrigen() {
		return this.origen;
	}
}
