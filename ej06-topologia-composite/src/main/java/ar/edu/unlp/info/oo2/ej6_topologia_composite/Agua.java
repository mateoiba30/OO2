package ar.edu.unlp.info.oo2.ej6_topologia_composite;

public class Agua extends Topologia{
	
	public Agua() {
		
	}
	
	public boolean igual(Topologia topologia) {
		return topologia.igual(this);
	}
	
	public boolean igual(Agua agua) {
		return true;
	}
	
	public boolean igual(Tierra tierra) {
		return false;
	}
	
	public boolean igual(Mixta mixta) {
		return false;
	}
	
	public boolean igual(Pantano pantano) {
		return false;
	}
	
	public double proporcionAgua() {
		return 1;
	}
	
	public double proporcionTierra() {
		return 0;
	}

}
