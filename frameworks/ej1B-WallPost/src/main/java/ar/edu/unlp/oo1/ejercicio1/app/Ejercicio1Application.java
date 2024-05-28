package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;
import ar.edu.unlp.oo1.ejercicio1.logging.JSONFormatter;
import ar.edu.unlp.oo1.ejercicio1.logging.SecretSimpleFormatter;
import ar.edu.unlp.oo1.ejercicio1.logging.ShoutingSimpleFormatter;

public class Ejercicio1Application {

	public static void main(String[] args) throws SecurityException, IOException {
		
		Logger postsLogger = Logger.getLogger("start");
		postsLogger.setLevel(Level.INFO);//este es el level del logger, luego indico el level del handler
		Handler fileHandler = new FileHandler("start");//no indicar que es .txt, eso ya es automático
		//fileHandler.setFormatter(new ShoutingSimpleFormatter());
		//fileHandler.setFormatter(new JSONFormatter());
		fileHandler.setFormatter(new SecretSimpleFormatter(Arrays.asList("inicio", "dislike")));
		fileHandler.setLevel(Level.INFO);
		postsLogger.addHandler(fileHandler);
		postsLogger.log(Level.INFO, "inicio de la aplicación");
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					new WallPostUI();
				} catch (SecurityException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
