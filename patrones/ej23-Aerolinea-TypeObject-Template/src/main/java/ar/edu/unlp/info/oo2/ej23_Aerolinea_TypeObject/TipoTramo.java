package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;
import java.time.DayOfWeek;
import java.util.List;

public class TipoTramo {
	
	private String codigoTramo;
	private List<DayOfWeek> frecuencia;
	private String origen;
	private String destino;
	private double duracionHoras;
	
	public TipoTramo(String codigoTramo, List<DayOfWeek> frecuencia, String origen, String destino, double duracionHoras) {
		this.codigoTramo = codigoTramo;
		this.frecuencia = frecuencia;
		this.origen = origen;
		this.destino = destino;
		this.duracionHoras = duracionHoras;
	}
	
	public String getCodigoTramo() {
		return this.codigoTramo;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}
	
	public double getDuracionHoras() {
		return this.getDuracionHoras();
	}
	
}
