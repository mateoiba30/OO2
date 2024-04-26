package ar.edu.unlp.info.oo2.ej21_Genealigia_NullObject;

import java.time.LocalDate;

public class NullMamifero {
	
	public NullMamifero() {
	}
	
	public boolean tieneComoAncestroA(RealMamifero mamifero) {
		return false;
	}
	
	public String getIdentificador() {
		return null;
	}
	public void setIdentificador(String ididentificador) {

	}
	public String getEspecie() {
		return null;
	}
	public void setEspecie(String especie) {

	}
	public LocalDate getFechaNacimiento() {
		return null;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {

	}
	public RealMamifero getPadre() {
		return null;
	}
	public void setPadre(RealMamifero padre) {

	}
	public RealMamifero getMadre() {
		return null;
	}
	public void setMadre(RealMamifero madre) {

	}
	public RealMamifero getAbueloPaterno() {
		return null;
	}
	public RealMamifero getAbuelaPaterna() {
		return null;
	}
	public RealMamifero getAbueloMaterno() {
		return null;
	}
	public RealMamifero getAbuelaMaterna() {
		return null;
	}


}