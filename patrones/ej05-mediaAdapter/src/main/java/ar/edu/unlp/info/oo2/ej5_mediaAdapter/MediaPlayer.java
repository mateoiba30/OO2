package ar.edu.unlp.info.oo2.ej5_mediaAdapter;
import java.util.List;

public class MediaPlayer {
	private List<Media> medias;
	
	public MediaPlayer(List<Media> medias) {
		this.medias = medias;
	}
	
	public String play() {
		return medias.get(0).play();
	}

	public List<Media> getMedia() {
		return this.medias;
	}

	public void setMedia(List<Media> medias) {
		this.medias = medias;
	}
}