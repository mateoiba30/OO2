package ar.edu.unlp.info.oo2.ej22_SubteWay_Builder;

public class Celiaco implements Constructor{
	
	public void ponerPan(Sanguche s) {
		Elemento pan = new Elemento("pan de chipa", 150);
		s.setPan(pan);
	}
	public void ponerAderezo(Sanguche s) {
		Elemento aderezo = new Elemento("salsa tartara", 18);
		s.setAderezo(aderezo);
	}
	public void ponerPrincipal(Sanguche s) {
		Elemento principal = new Elemento("carne de pollo", 250);
		s.setPrincipal(principal);
	}
	public void ponerAdicional(Sanguche s) {
		Elemento adicional = new Elemento("verduras grilladas", 200);
		s.setAdicional(adicional);
	}

}