package ar.edu.unlp.info.oo2.ej8_toDoItem_State;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class ToDoItem {
	
	private String name;
	private Estado estado;
	private LocalDateTime start;
	private LocalDateTime end;
	private List<String> commentaries;
	
	public ToDoItem(String name) {
		this.name = name;
		this.estado = new Pending(this);
		this.commentaries = new ArrayList<>();
	}
	
	public void incorporateComment(String comment) {
		this.commentaries.add(comment);
	}
	
	public void start() {
		this.estado.start();
	}
	
	public void togglePause() { //public void togglePause(this) -> hacerlo así el estado no debe conocer al todoitem
		this.estado.togglePause();
	}
	
	public void finish() {
		this.estado.finish();
	}
	
	public Duration workedTime() {
		return this.estado.workedTime();
	}
	
	public void addComment(String comment) {
		this.estado.addComment(comment);
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void setStart(LocalDateTime date) {
		this.start = date;
	}
	
	public void setEnd(LocalDateTime date) {
		this.end = date;
	}
	
	public LocalDateTime getStart() {
		return this.start;
	}
	
	public LocalDateTime getEnd() {
		return this.end;
	}
	
	public List<String> getCommentaries(){
		return this.commentaries;
	}
}
