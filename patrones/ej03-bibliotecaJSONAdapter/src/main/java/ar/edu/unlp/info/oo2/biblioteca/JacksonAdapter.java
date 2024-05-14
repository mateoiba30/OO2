package ar.edu.unlp.info.oo2.biblioteca;

public class JacksonAdapter extends VoorheesExporter {
	
	private JacksonAdaptee jsonExporter;
	
	public JacksonAdapter() {
		this.jsonExporter = new JacksonAdaptee();
	}
	
	public String exportar(Socio socio) {
		return this.jsonExporter.exportar(socio);
	}

}
