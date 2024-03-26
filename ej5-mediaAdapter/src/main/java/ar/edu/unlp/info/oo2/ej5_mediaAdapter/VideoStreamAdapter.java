package ar.edu.unlp.info.oo2.ej5_mediaAdapter;

public class VideoStreamAdapter extends Media {
	
	private VideoStream videoStream;
	
	public VideoStreamAdapter() {
		
	}
	
	@Override  //NO OLVIDAR DE PONER EL OVERRIDE
	public String play() {
		return this.videoStream.reproduce();
	}
}
