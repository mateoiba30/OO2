package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class VoorheesExporter {

	private String exportar(Socio socio) {
		String separator = System.lineSeparator(); //se usa para introducir un salto de línea dependiendo el SO que se esté usando
		return "\t{" + separator
			+ "\t\t\"nombre\": \"" + socio.getNombre() + "\"," + separator
			+ "\t\t\"email\": \"" + socio.getEmail() + "\"," + separator
			+ "\t\t\"legajo\": \"" + socio.getLegajo() + "\"" + separator
			+ "\t}";
	}

	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder("[" + separator); //StringBuilder es un string mutable y es más eficiente para concatenar al usar eñ '+' , no es que cambia la celda a la que apunta cuando le modifico el contenido, como hace String
		
		socios.forEach(socio -> {
			buffer.append(this.exportar(socio))
				.append(",")
				.append(separator);
		});
		
		// remueve la última coma y fin de línea
		buffer.setLength(buffer.length() - (separator.length() + 1));
		buffer.append(separator).append("]");
		return buffer.toString();
	}
}
