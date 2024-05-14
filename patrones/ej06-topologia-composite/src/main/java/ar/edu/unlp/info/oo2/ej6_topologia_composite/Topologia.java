package ar.edu.unlp.info.oo2.ej6_topologia_composite;

public abstract class Topologia {
	
	public Topologia() {
		
	}
	
	@Override
	public  boolean equals(Object objeto) {
		if (objeto instanceof Topologia) //primero ponemos esto para evitar que tire error si le mando algo que no es una instancia de topologia
			return this.isEquals((Topologia)objeto); //el instance of solo es válido practicamente cuando lo usamos al redefinir Equals()
		return false;
	}
	
	public  boolean isEquals(Topologia topografia) {
		return this.igual(topografia);
	}
	
	public abstract boolean igual(Topologia topologia);
	
	public abstract boolean igual(Mixta mixta);
	
	public abstract boolean igual(Agua agua);
	
	public abstract boolean igual(Tierra tierra);
	
	public abstract boolean igual(Pantano pantano);
	
	public abstract double proporcionAgua();
	
	public abstract double proporcionTierra();
	
	
}
