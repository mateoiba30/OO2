package ar.edu.unlp.info.oo2.ej6_topologia_composite;

public class Pantano extends Topologia{

	public Pantano() {
		
	}
	
	public boolean igual(Topologia topologia) {
		return topologia.igual(this);
	}
	
	public boolean igual(Agua agua) {
		return false;
	}
	
	public boolean igual(Tierra tierra) {
		return false;
	}
	
	public boolean igual(Mixta mixta) {
		return false;
	}
	
	public boolean igual(Pantano pantano) {
		return true;
	}
	
	public double proporcionAgua() {
		return 0.7;
	}
	
	public double proporcionTierra() {
		return 0.3;
	}
}
