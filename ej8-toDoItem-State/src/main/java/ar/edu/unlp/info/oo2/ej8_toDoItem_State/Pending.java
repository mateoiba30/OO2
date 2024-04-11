package ar.edu.unlp.info.oo2.ej8_toDoItem_State;
import java.time.LocalDateTime;
import java.time.Duration;

public class Pending extends Estado {

	public Pending(ToDoItem task) {
		super(task);
	}
	
	public void start() {
		this.setEstado(new Progress(this.getTask()));
		this.setStart(LocalDateTime.now());
	}
	
	public void togglePause() {
		throw new RuntimeException("ERROR: you can't pause (or unpause) in pending state");
	}
	
	public void finish() {
		
	}
	
	public Duration workedTime() {
		throw new RuntimeException("ERROR: the task never started"); //si no inició no podemos medir nada
	}
	
	public void addComment(String comment) {
		this.incorporateComment(comment);
	}
}
