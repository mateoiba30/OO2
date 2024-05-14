package ar.edu.unlp.info.oo2.ej21_Genealigia_NullObject;

import java.time.LocalDate;

public class RealMamifero {
	
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private RealMamifero padre;
	private RealMamifero madre;
	
	public RealMamifero() {
		this.identificador="";
		this.especie="";
		this.fechaNacimiento=LocalDate.now();
	}
	
	public RealMamifero(String identificador) {
		this.identificador=identificador;
		this.especie="";
		this.fechaNacimiento=LocalDate.now();
	}
	
	public boolean tieneComoAncestroA(RealMamifero mamifero) {
		return this.vienePorPapi(mamifero) || this.vienePorMami(mamifero);
	}
	
	private boolean vienePorPapi(RealMamifero mamifero) {
		//if (this.padre == null) return false;
		return this.padre.equals(mamifero) || this.padre.tieneComoAncestroA(mamifero);
	}

	private boolean vienePorMami(RealMamifero mamifero) {
		//if (this.madre == null) return false;
		return this.madre.equals(mamifero) || this.madre.tieneComoAncestroA(mamifero);
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String ididentificador) {
		this.identificador = ididentificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public RealMamifero getPadre() {
		return padre;
	}
	public void setPadre(RealMamifero padre) {
		this.padre = padre;
	}
	public RealMamifero getMadre() {
		return madre;
	}
	public void setMadre(RealMamifero madre) {
		this.madre = madre;
	}
	public RealMamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	public RealMamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	public RealMamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	public RealMamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}


}