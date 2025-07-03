package parcial_28_06_2025;

public class PlanIntegral extends PlanMedico {
	
	public PlanIntegral(LocalDate fechaContratacion) {
		super(fechaContratacion);
	}
	
	protected double montoFijo(Afiliado afiliado) {
		return 22000;
	}
	
	protected double cargoFamiliar(Afiliado afiliado) {
		return afiliado.getFamiliaresACargo()*3000 + afiliado.getSalario()*0.01;
	}
	
	protected double coberturaViajera(Afiliado afiliado) {
		return afiliado.getSalario() * 0.03 - afiliado.getAntiguedad() * 10000;
	}

}
