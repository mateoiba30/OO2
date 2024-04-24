package ar.edu.unlp.info.oo2.biblioteca;
import org.json.simple.JSONObject;

public class JSONSimpleAdaptee {
	
	private JSONObject exportardorDeObjetos;
	
	public JSONSimpleAdaptee() {
		this.exportardorDeObjetos = new JSONObject();
	}

	public String exportar(Socio socio) {
		this.exportardorDeObjetos.put("nombre", socio.getNombre());
		this.exportardorDeObjetos.put("email", socio.getEmail());
		this.exportardorDeObjetos.put("legajo", socio.getLegajo());
		return this.exportardorDeObjetos.toJSONString();
	}
	
}
