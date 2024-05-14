package ar.edu.unlp.info.oo2.ej22_SubteWay_Builder;

public class Vegetariano implements Constructor{
	
	public void ponerPan(Sanguche s) {
		Elemento pan = new Elemento("pan con semillas", 120);
		s.setPan(pan);
	}
	public void ponerAderezo(Sanguche s) {
		Elemento aderezo = new Elemento("", 0);
		s.setAderezo(aderezo);
	}
	public void ponerPrincipal(Sanguche s) {
		Elemento principal = new Elemento("provoleta grillada", 200);
		s.setPrincipal(principal);
	}
	public void ponerAdicional(Sanguche s) {
		Elemento adicional = new Elemento("berenjenas al escabeche", 100);
		s.setAdicional(adicional);
	}

}
