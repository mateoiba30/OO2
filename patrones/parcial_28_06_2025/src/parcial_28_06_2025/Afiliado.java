package parcial_28_06_2025;

public class Afiliado {
	private PlanMedico plan;
	private List<PlanMedico> previos;
	private String nombre;
	private int familiaresACargo;
	private double salario;
	private LocalDate fechaNacimiento;
	private Coseguro coseguro;
	
	public double calcularMonto() {
		this.plan.calcularMonto(this);
	}
	
	public void setPlanMedico(PlanMedico plan) {
		this.plan = plan;
	}
	
	public double getDescuento() {
		return this.coseguro.getDescuento();
	}
	
	public double getMontoCoberturaViajes() {
		return this.coseguro.getMontoCoberturaViajes();
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public double getAntiguedad() {
		return this.coseguro.getAntiguedad();
	}
	
	public int getFamiliaresACargo() {
		return this.familiaresACargo;
	}
	
}
