package ar.edu.unlp.oo2.persitencia;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class PostRepository {

	@SuppressWarnings("unchecked")
	public List<Post> findPostsByUsername(String aUsername) {
		JSONParser parser = new JSONParser();
		
		try {
            // El método sleep() hace que el hilo actual espere la cantidad de tiempo especificada en milisegundos
            Thread.sleep(1000); // 1000 milisegundos = 1 segundo
        } catch (InterruptedException e) {
            // Manejo de excepciones si hay interrupciones mientras el hilo está dormido
            e.printStackTrace();
        }
		
		try {
			List<JSONObject> postsData = (List<JSONObject>) parser.parse(new FileReader("posts.json"));
			return postsData.stream()
				.filter(postData -> ((String) postData.get("posted_by")).equals(aUsername))
				.map(postData -> new Post((String) postData.get("text")))
				.collect(Collectors.toList());
		} catch (Exception e) {
			return new ArrayList<Post>();
		}
	}

}
