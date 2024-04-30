package ar.edu.unlp.info.oo2.ej22_SubteWay_Builder;

public class Clasico implements Constructor{
	
	public void ponerPan(Sanguche s) {
		Elemento pan = new Elemento("pan de brioche", 100);
		s.setPan(pan);
	}
	public void ponerAderezo(Sanguche s) {
		Elemento aderezo = new Elemento("mayonesa", 20);
		s.setAderezo(aderezo);
	}
	public void ponerPrincipal(Sanguche s) {
		Elemento principal = new Elemento("carne de ternera", 300);
		s.setPrincipal(principal);
	}
	public void ponerAdicional(Sanguche s) {
		Elemento adicional = new Elemento("tomate", 80);
		s.setAdicional(adicional);
	}

}
