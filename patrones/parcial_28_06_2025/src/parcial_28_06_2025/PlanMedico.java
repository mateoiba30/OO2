package parcial_28_06_2025;

public abstract class PlanMedico {
	private LocalDate fechaContratacion;
	
	public PlanMedico(LocalDate fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}
	
	public LocalDate getFechaContratacion() {
		return this.fechaContratacion;
	}
	public int limitePrestaciones() { //es por este motivo que no es un strategy
		return 0;
	}
	public double calcularMonto(Afiliado afiliado) {
		return this.montoFijo(afiliado) + this.cargoFamiliar(afiliado) + this.coberturaViajera(afiliado) + this.seguroInternacion(afiliado);
	}
	
	protected abstract double montoFijo(Afiliado afiliado);
	
	protected abstract double cargoFamiliar(Afiliado afiliado);
	
	protected double coberturaViajera(Afiliado afiliado) {
		return afiliado.getSalario() * 0.01 - afiliado.getMontoCoberturaViajes();
	}

	protected double seguroInternacion(Afiliado afiliado) {
		return this.montoFijo(afiliado)*0.05;
	}
}
