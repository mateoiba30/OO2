package ar.edu.unlp.oo1.ejercicio1.logging;
import java.util.List;
import java.util.logging.*;

public class SecretHandler extends Handler {
	private Handler handler;
	private Formatter secretFormatter;
	
	public SecretHandler (Handler handler, List<String> secretWords) {
		this.handler = handler;
		this.secretFormatter = new SecretSimpleFormatter(secretWords);
	}
	
	public void publish(LogRecord record) {
		LogRecord secureRecord = record;
		secureRecord.setMessage(this.secretFormatter.format(record));
		this.handler.publish(secureRecord);
	}
	
	public void flush() {
		this.handler.flush();
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}
}
