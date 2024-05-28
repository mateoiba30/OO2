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
import java.util.logging.*;
import ar.edu.unlp.oo1.ejercicio1.logging.SecretHandler;

public class Ejercicio1Application {

	public static void main(String[] args) throws SecurityException, IOException {
		
		Logger postsLogger = Logger.getLogger("postsLogger");
		postsLogger.setUseParentHandlers(false);
		
		
		
		Handler fileHandler = new FileHandler("output");//no indicar que es .txt, eso ya es automático
		fileHandler.setFormatter(new JSONFormatter());
		//fileHandler.setFormatter(new ShoutingSimpleFormatter());
		//postsLogger.addHandler(fileHandler);
		
		Handler secureHandler = new SecretHandler(fileHandler, Arrays.asList("inicio", "dislike"));
		postsLogger.addHandler(secureHandler);
				
		postsLogger.info("inicio de la aplicación");
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}
}
