package parcial_28_06_2025;

public class CoseguroReal implements Coseguro{
	private String nombre;
	private int descuento;
	private LocalDate fechaIngreso;
	private double montoCoberturaViajes;
	
	public CoseguroReal(String nombre, int descuento, LocalDate fechaIngreso, double montoCoberturaViajes) {
		this.nombre = nombre;
		this.descuento = descuento;
		this.fechaIngreso = fechaIngreso;
		this.montoCoberturaViajes = montoCoberturaViajes;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	public int getAntiguedad() {
		return ChronoUnit.YEARS.between(LocalDate.now(), this.fechaIngreso);
	}
	
	public double getMontoCoberturaViajes() {
		return this.montoCoberturaViajes;
	}

}
