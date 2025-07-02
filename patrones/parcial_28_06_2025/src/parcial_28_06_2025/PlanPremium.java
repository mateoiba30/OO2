package parcial_28_06_2025;

public class PlanPremium extends PlanMedico {
	
	protected double montoFijo(Afiliado afiliado) {
		return 33000 - afiliado.getDescuento();
	}
	
	protected double cargoFamiliar(Afiliado afiliado) {
		if (afiliado.getFamiliaresACargo() > 4)
			return afiliado.getFamiliaresACargo() * 2800;
		return 0;
	}

}
