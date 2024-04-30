package ar.edu.unlp.info.oo2.ej22_SubteWay_Builder;

public class Vegano implements Constructor{
	
	public void ponerPan(Sanguche s) {
		Elemento pan = new Elemento("pan integral", 100);
		s.setPan(pan);
	}
	public void ponerAderezo(Sanguche s) {
		Elemento aderezo = new Elemento("salsa criolla", 20);
		s.setAderezo(aderezo);
	}
	public void ponerPrincipal(Sanguche s) {
		Elemento principal = new Elemento("milanesa de girgolas", 500);
		s.setPrincipal(principal);
	}
	public void ponerAdicional(Sanguche s) {
		Elemento adicional = new Elemento("", 0);
		s.setAdicional(adicional);
	}

}