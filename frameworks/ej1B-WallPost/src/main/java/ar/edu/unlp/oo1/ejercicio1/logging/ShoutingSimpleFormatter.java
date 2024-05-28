package ar.edu.unlp.oo1.ejercicio1.logging;
import java.util.logging.*;

public class ShoutingSimpleFormatter extends SimpleFormatter {

	@Override
	public String format(LogRecord record) { //obligatoriamente debe llamarse de esta forma el método
		return super.format(record).toUpperCase();
	}
}
