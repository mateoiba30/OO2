package ar.edu.unlp.oo1.ejercicio1.logging;
import java.util.logging.*;

public class JSONFormatter extends Formatter{

	public String format(LogRecord record) {
	    return "{ \"message\": \"" + record.getMessage() + "\", \"level\": \"" + record.getLevel() + "\" }";
	}

}
