package ar.edu.unlp.info.oo2.ej23_Aerolinea_TypeObject;
import java.time.LocalDate;

public class DateLapse{
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public boolean includesDate(LocalDate other) {
		
		if (( other.isAfter(this.from) && other.isBefore(this.to) ) || other.equals(this.from) || other.equals(this.to) )
			return true;
		else
			return false;
	}
}