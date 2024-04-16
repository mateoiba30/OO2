package ar.edu.unlp.info.oo2.ej6_topologia_composite;

public abstract class Topologia {
	
	public Topologia() {
		
	}
	
	@Override
	public  boolean equals(Object objeto) {
		return this.isEquals((Topologia)objeto);  
	}
	
	public  boolean isEquals(Topologia topografia) {
		return (this.proporcionAgua() == topografia.proporcionAgua());
	}
	
	public abstract boolean igual(Topologia topologia);
	
	public abstract boolean igual(Mixta mixta);
	
	public abstract boolean igual(Agua agua);
	
	public abstract boolean igual(Tierra tierra);
	
	public abstract boolean igual(Pantano pantano);
	
	public abstract double proporcionAgua();
	
	public abstract double proporcionTierra();
	
	
}
