package parcial_28_06_2025;

public class PlanObligatorio extends PlanMedico {
	
	public PlanObligatorio(LocalDate fechaContratacion) {
		super(fechaContratacion);
	}
	
	protected double montoFijo(Afiliado afiliado) {
		return 15000;
	}
	
	protected double cargoFamiliar(Afiliado afiliado) {
		return afiliado.getFamiliaresACargo() * (3500 - afiliado.getDescuento());
	}
	
	protected double seguroInternacion() {
		return 0;
	}
}
