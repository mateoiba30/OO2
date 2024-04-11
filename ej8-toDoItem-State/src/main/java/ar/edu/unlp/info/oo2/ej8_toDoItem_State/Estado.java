package ar.edu.unlp.info.oo2.ej8_toDoItem_State;
import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Estado {

	private ToDoItem task;
	
	public Estado(ToDoItem task) {
		this.task = task;
	}
	
	/*//no usarla porque termina generando envidia de atributos
	public ToDoItem getTask() {
		return this.task;
	}*/
	
	public void incorporateComment(String comment) {
		this.task.incorporateComment(comment);
	}
	
	public void setEstado(Estado estado) {
		this.task.setEstado(estado);
	}
	
	public void setStart(LocalDateTime date) {
		this.task.setStart(date);
	}
	
	public void setEnd(LocalDateTime date) {
		this.task.setEnd(date);
	}
	
	public LocalDateTime getStart() {
		return this.task.getStart();
	}
	
	public LocalDateTime getEnd() {
		return this.task.getEnd();
	}
	
	public abstract void start();
	
	public abstract void togglePause();
	
	public abstract void finish();
	
	public abstract Duration workedTime();
	
	public abstract void addComment(String comment);
	
	public ToDoItem getTask() {
		return this.task;
	}
}
