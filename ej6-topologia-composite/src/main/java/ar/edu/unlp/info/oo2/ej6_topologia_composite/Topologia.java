package ar.edu.unlp.info.oo2.ej6_topologia_composite;

public abstract class Topologia {
	
	public Topologia() {
		
	}
	
	public abstract boolean igual(Topologia topologia);
	
	public abstract boolean igual(Mixta mixta);
	
	public abstract boolean igual(Agua agua);
	
	public abstract boolean igual(Tierra tierra);
	
	public abstract double proporcionAgua();
	
	public abstract double proporcionTierra();
	
	
}
