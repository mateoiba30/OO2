package ar.edu.unlp.info.oo2.ej9_Excursiones_State;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Excursion {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String encuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private Estado estado;
	private List<Usuario> usuariosEspera;
	private List<Usuario> usuariosInscriptos;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String encuentro, double costo, int cupoMin, int cupoMax) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.encuentro = encuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.estado = new Provisoria(); //arranca con la lista de usuarios vacía
		this.usuariosEspera = new ArrayList<>();
		this.usuariosInscriptos = new ArrayList<>();
	}
	
	public List<String> getMails(){
		return this.usuariosInscriptos.stream().map(u -> u.getMail()).collect(Collectors.toList());
	}
	
	public int getUsuariosRestantesMinimos() {
		return cupoMin - this.usuariosInscriptos.size();
	}
	
	public int getUsuariosRestantesMaximos(){
		return cupoMax - this.usuariosInscriptos.size();
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion(this);
	}
	
	public void inscribirUsuario(Usuario usuario) {
		if (this.estado.inscribirUsuario(this))
			this.usuariosInscriptos.add(usuario);
		else
			this.usuariosEspera.add(usuario);
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public boolean pasarADefinitiva() {
		return this.usuariosInscriptos.size() == this.cupoMin -1; //si falta un usuario para cumplir el monto mínimo, cuando inscriba uno nuevo debo cambiar al estado de 'Definitiva'
	}
	
	public boolean pasarAOcupada() {
		return this.usuariosInscriptos.size() == this.cupoMax -1; //si falta un usuario para cumplir el monto mínimo, cuando inscriba uno nuevo debo cambiar al estado de 'Ocupada'
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getEncuentro() {
		return encuentro;
	}

	public void setEncuentro(String encuentro) {
		this.encuentro = encuentro;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public void setCupoMin(int cupoMin) {
		this.cupoMin = cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public void setCupoMax(int cupoMax) {
		this.cupoMax = cupoMax;
	}

	public List<Usuario> getUsuariosEspera() {
		return usuariosEspera;
	}

	public void setUsuariosEspera(List<Usuario> usuariosEspera) {
		this.usuariosEspera = usuariosEspera;
	}

	public List<Usuario> getUsuariosInscriptos() {
		return usuariosInscriptos;
	}

	public void setUsuariosInscriptos(List<Usuario> usuariosInscriptos) {
		this.usuariosInscriptos = usuariosInscriptos;
	}

	public Estado getEstado() {
		return estado;
	}
	
	
	public String getCostoString() {
		return String.valueOf(this.getCosto());
	}
	
	public String getFechaInicioString() {
		return String.valueOf(this.getFechaInicio());
	}
	
	public String getFechaFinString() {
		return String.valueOf(this.getFechaFin());
	}
	
	public String getUsuariosRestantesMinimosString() {
		return String.valueOf(this.getUsuariosRestantesMinimos());
	}
	
	public String getUsuariosRestantesMaximosString() {
		return String.valueOf(this.getUsuariosRestantesMaximos());
	}
	
	public String getMailsString() {
		return String.join(" ", this.getMails());
	}
	
	
}
