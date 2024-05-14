package ar.edu.unlp.info.oo2.ej8_toDoItem_State;
import java.time.Duration;

public class Finished extends Estado {

	public Finished(ToDoItem task) {
		super(task);
	}
	
	public void start() {

	}
	
	public void togglePause() {
		throw new RuntimeException("ERROR: you can't pause (or unpause) in finished state");
	}
	
	public void finish() {
		
	}
	
	public Duration workedTime() {
		return Duration.between(this.getStart(), this.getEnd());
	}
	
	public void addComment(String comment) {
		
	}
}
