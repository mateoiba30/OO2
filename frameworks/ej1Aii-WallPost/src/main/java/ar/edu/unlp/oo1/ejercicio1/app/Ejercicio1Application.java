package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	public static void main(String[] args) throws SecurityException, IOException {
		
		Logger postsLogger = Logger.getLogger("postsLogger"); //Logger postsLoggerHijo = Logger.getLogger("start.hijo"); //este hereda el comportamiento del padre
        postsLogger.setUseParentHandlers(false);
        Handler fileHandler = new FileHandler("outputLogs");//no indicar que es .txt, eso ya es automático
		fileHandler.setFormatter(new SimpleFormatter());
		postsLogger.addHandler(fileHandler);
		
		postsLogger.info("inicio de la aplicación");
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}
}
