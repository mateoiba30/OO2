package ar.edu.unlp.info.oo2.ej22_SubteWay_Builder;

public class Director {
	
	private Constructor constructor;

	public Director(Constructor constructor) {
		this.constructor = constructor;
	}
	
	public Sanguche crear() {
		Sanguche s = new Sanguche();
		this.constructor.ponerPan(s);
		this.constructor.ponerAderezo(s);
		this.constructor.ponerPrincipal(s);
		this.constructor.ponerAdicional(s);
		return s;
	}

}
