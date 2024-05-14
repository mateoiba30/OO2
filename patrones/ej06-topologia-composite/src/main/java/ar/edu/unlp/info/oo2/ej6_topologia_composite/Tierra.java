package ar.edu.unlp.info.oo2.ej6_topologia_composite;

public class Tierra extends Topologia{
	
	public Tierra() {
		
	}
	
	public boolean igual(Topologia topologia) {
		return topologia.igual(this);
	}
	
	public boolean igual(Agua agua) {
		return false;
	}
	
	public boolean igual(Tierra tierra) {
		return true;
	}
	
	public boolean igual(Mixta mixta) {
		return false;
	}
	
	public boolean igual(Pantano pantano) {
		return false;
	}
	
	public double proporcionAgua() {
		return 0;
	}
	
	public double proporcionTierra() {
		return 1;
	}

}