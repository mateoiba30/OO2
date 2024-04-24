package ar.edu.unlp.info.oo2.ej8_toDoItem_State;
import java.time.LocalDateTime;
import java.time.Duration;

public class Progress extends Estado {

	public Progress(ToDoItem task) {
		super(task);
	}
	
	public void start() {
		
	}
	
	public void togglePause() {
		this.setEstado(new Paused(this.getTask()));
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
