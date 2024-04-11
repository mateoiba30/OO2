package ar.edu.unlp.info.oo2.ej8_toDoItem_State;
import java.time.LocalDateTime;
import java.time.Duration;

public class Paused extends Estado {

	public Paused(ToDoItem task) {
		super(task);
	}
	
	public void start() {

	}
	
	public void togglePause() {
		this.setEstado(new Progress(this.getTask()));
	}
	
	public void finish() {
		this.setEstado(new Finished(this.getTask()));
		this.setEnd(LocalDateTime.now());
	}
	
	public Duration workedTime() {
		return Duration.between(this.getStart(), LocalDateTime.now());
	}
	
	public void addComment(String comment) {
		this.incorporateComment(comment);
	}
}
