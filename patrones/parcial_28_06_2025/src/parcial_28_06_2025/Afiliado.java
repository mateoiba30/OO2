package parcial_28_06_2025;

public class Afiliado {
	private PlanMedico plan;
	private List<PlanMedico> previos;
	private String nombre;
	private int familiaresACargo;
	private double salario;
	private LocalDate fechaNacimiento;
	private Coseguro coseguro;
	
	public Afiliado(PlanMedico plan, List<PlanMedico> previos, String nombre, int familiaresACargo, double salario, LocalDate fechaNacimiento, Coseguro coseguro) {
		this.plan = plan;
		this.previos = previos;
		this.nombre = nombre;
		this.familiaresACargo = familiaresACargo;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.coseguro = coseguro;
	}
	
	public void setCoseguro(Coseguro coseguro) {
		this.coseguro = coseguro;
	}
	
	public void setPlanMedico(PlanMedico plan) {
		this.previos.add(this.plan);
		this.plan = plan;
	}
	
	public double calcularMonto() {
		this.plan.calcularMonto(this);
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
