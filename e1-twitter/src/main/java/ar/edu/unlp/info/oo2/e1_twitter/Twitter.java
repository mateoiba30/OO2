package ar.edu.unlp.info.oo2.e1_twitter;
import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<>();
	}
	
	public Usuario agregarUsuario(String screenName) {
		if(!existe(screenName)) {
			Usuario usuario = new Usuario(screenName);
			usuarios.add(usuario);
			return usuario;
		}
		return null;
	}
	
	private boolean existe(String screenName) {
//		boolean existe = false;
//		for (Usuario usuario: this.usuarios) {
//			if(usuario.esIgual(screenName)) {
//				existe = true;
//				break;
//			}	
//		}
//		return existe;
		return this.usuarios.stream().anyMatch(usuario -> usuario.esIgual(screenName));
	}
	
	public void eliminarUsuario(String screenName) {
		Usuario usuarioAEliminar = buscarUsuario(screenName);
		List<Posteo> posteos = usuarioAEliminar.getPosteos();
		eliminarRecursivo(posteos);
		
		usuarioAEliminar.vaciarPosteos();
		this.usuarios.remove(usuarioAEliminar); 
	}
	
	private void eliminarRecursivo(List<Posteo> posteos) {
		for(Usuario usuario: usuarios) {
			String nombre = usuario.getNombre();//pa debuguear
			List<Posteo> posteosRelacionados = new ArrayList<>();
			posteosRelacionados = usuario.getPosteosRelacionados(posteos);
			int tamanio = posteosRelacionados.size();//lo declaro así pa debuguear
			if(tamanio!=0)//hay que poner un caso base
				eliminarRecursivo(posteosRelacionados); //en cada recursión solo avanzo 1 nivel de retweeteo
			usuario.eliminarPosteosRelacionados(posteosRelacionados);
		}
		
	}
	
	private Usuario buscarUsuario(String screenName) {
		return this.usuarios.stream().filter(u -> u.esIgual(screenName)).findFirst().orElse(null);
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
}
