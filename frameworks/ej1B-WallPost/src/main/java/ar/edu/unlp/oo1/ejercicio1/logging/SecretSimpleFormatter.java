package ar.edu.unlp.oo1.ejercicio1.logging;
import java.util.logging.*;
import java.util.ArrayList;
import java.util.List;

public class SecretSimpleFormatter extends SimpleFormatter{
	
	private List<String> secretWords;
	
	public SecretSimpleFormatter(List<String> secretWords) {
		this.secretWords = secretWords;
	}
	
	public String hideMessage(String message) {
		String result = "";
		String[] words = message.split("\\s+"); 
		for (String word : words) {
			if ( this.secretWords.contains(word) )
				result+=" ***";
			else
				result+=" "+ word;
		}

		return result;
	}
	
	public String format(LogRecord record) {
		String secretMessage = this.hideMessage(record.getMessage());
		record.setMessage(secretMessage);
		return super.format(record);
	}
}
