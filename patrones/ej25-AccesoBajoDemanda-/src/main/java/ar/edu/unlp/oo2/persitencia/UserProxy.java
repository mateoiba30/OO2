package ar.edu.unlp.oo2.persitencia;

import java.util.ArrayList;
import java.util.List;

public class UserProxy implements PersistableUser {
	
	private User user;
	private PostRepository buscador;

	public UserProxy(String aUsername, String anEmail) {
		this.user = new User(aUsername, anEmail); //cargarla vacía hasta que se pida lo contrario -> proxy
		this.buscador = new PostRepository();
	}
	
	@Override
	public String getUsername() {
		return this.user.getUsername();
	}

	@Override
	public String getEmail() {
		return this.user.getEmail();
	}

	@Override
	public String toString() {
		return this.user.toString();
	}

	@Override
	public List<Post> getPosts() {
		List<Post> posts = this.buscador.findPostsByUsername(this.user.getUsername());
		this.user.addPosts(posts);
		return this.user.getPosts();
	}
}