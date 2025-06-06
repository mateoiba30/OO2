package ar.edu.unlp.info.oo2.e1_twitter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
	
	private List<Posteo> posteos;
	private String screenName;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.posteos = new ArrayList<>();
	}
	
	public Posteo tweetear(String texto) {
		Posteo tweet = new Tweet(texto);
		this.posteos.add(tweet);
		return tweet;
	}
	
	public Posteo retweetear(Posteo origen) {
		Posteo retweet = new Retweet(origen);
		this.posteos.add(retweet);
		return retweet;
	}
	
	public boolean esIgual(String screenName) {
		return this.screenName == screenName;
	}
	
	public List<Posteo> getPosteos(){
		return this.posteos;
	} 
	
	public int getPosteosSize(){
		return this.posteos.size();
	} 
	
	public List<Posteo> getPosteosRelacionados(List<Posteo> origenes){
//		List<Posteo> posteosRelacionados = new ArrayList<>();
//		for(Posteo posteo: this.posteos) {
//			if(origenes.contains(posteo.getOrigen())) {
//				posteosRelacionados.add(posteo);
//			}
//		}
//		return posteosRelacionados;
		return this.posteos.stream().filter(posteo -> origenes.contains(posteo.getOrigen())).collect(Collectors.toList());
	}
	
	public int getPosteosRelacionadosSize(List<Posteo> origenes){
		return this.getPosteosRelacionados(origenes).size();
	}
	
	
	public void eliminarPosteosRelacionados(List<Posteo> origenes) {
//		for(Posteo posteo: this.posteos) {
//			if(origenes.contains(posteo.getOrigen())) {
//				this.posteos.remove(posteo);
//			}
//		}
		//porque no me dejaba eliminar posteos dentro del for?
		this.posteos.removeIf(posteo -> origenes.contains(posteo.getOrigen()));
	}
	
	// public void eliminarPosteos() no se si va a ser necesario
	
	public String getNombre() {
		return this.screenName;
	}
	
	public void vaciarPosteos() {
		this.posteos.clear();
	}
}
