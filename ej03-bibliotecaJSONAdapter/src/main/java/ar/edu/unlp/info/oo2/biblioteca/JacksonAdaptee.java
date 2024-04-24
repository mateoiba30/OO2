package ar.edu.unlp.info.oo2.biblioteca;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdaptee{
	
	private ObjectMapper jsonExporter;
	
	public JacksonAdaptee() {
		this.jsonExporter = new ObjectMapper();
	}
	
	public String exportar(Socio socio) {
        try {
            String json = jsonExporter.writeValueAsString(socio);
            return json;
        } catch (Exception e) { //ante cualquier tipo de excepcion
            e.printStackTrace();
            return null;
        }
        
	}

}
