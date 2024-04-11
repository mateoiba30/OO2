package ar.edu.unlp.info.oo2.ej6_topologia_composite;
import java.util.List;
import java.util.ArrayList;

public class Mixta extends Topologia{
	
	public boolean igual(Topologia topologia) {
		return topologia.igual(this);
	}
	
	private List<Topologia> componentes;

	public Mixta() {
		this.componentes = new ArrayList<>();
	}
	
	@Override
	public boolean igual(Agua agua) {
		return false;
	}
	
	public boolean igual(Tierra tierra) {
		return false;
	}
	
	public boolean igual(Pantano pantano) {
		return false;
	}
	
	public boolean igual(Mixta mixta) {
		return this.componentes.get(0).igual(mixta.getComponent(0)) && this.componentes.get(1).igual(mixta.getComponent(1)) && this.componentes.get(2).igual(mixta.getComponent(2)) && this.componentes.get(3).igual(mixta.getComponent(3));
		//si en lugar de igual() hubiera redefinido equals() esto lo podría haber hecho con: return this.componentes.equals(mixta.getComponents());
	}
	
	public double proporcionAgua() {
		return this.componentes.stream().mapToDouble(c -> c.proporcionAgua()).sum() / 4;
	}
	
	public double proporcionTierra() {
		return 1- this.proporcionAgua();
	}

	public void addComponent(Topologia topologia) {
		if (this.componentes.size() < 4)
			this.componentes.add(topologia);
	}
	
	public int getCantidadComponentes() {
		return this.componentes.size();
	}
	
	public List<Topologia> getComponents(){
		return this.componentes;
	}
	
	public Topologia getComponent(int pos) {
		if (pos <4)
			return this.componentes.get(pos);
		return null;
	}
}