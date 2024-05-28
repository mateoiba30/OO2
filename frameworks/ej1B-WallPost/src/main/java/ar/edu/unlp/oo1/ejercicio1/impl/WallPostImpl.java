package ar.edu.unlp.oo1.ejercicio1.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

import ar.edu.unlp.oo1.ejercicio1.logging.JSONFormatter;
import ar.edu.unlp.oo1.ejercicio1.logging.SecretSimpleFormatter;
import ar.edu.unlp.oo1.ejercicio1.logging.ShoutingSimpleFormatter;
/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;

	public WallPostImpl(){
		this.text = "Undefined post";
		this.analizeLikes();
	}

	public WallPostImpl(String text, int likes, boolean isFeaured){
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeaured;
		this.analizeLikes();
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;

	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like(){
		this.likes = this.likes + 1;
		this.analizeLikes();	
	}

	@Override
	public void dislike() {
		if (likes > 0)
			this.likes = this.likes - 1;
		this.analizeLikes();
				
	}
	
	private void analizeLikes() {
		if (likes == 0)
			Logger.getLogger("postsLogger").warning("no hay likes");
		else
			if (likes == 10)
				Logger.getLogger("postsLogger").warning("llegaste a 10 likes, felicitaciones!");
	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
