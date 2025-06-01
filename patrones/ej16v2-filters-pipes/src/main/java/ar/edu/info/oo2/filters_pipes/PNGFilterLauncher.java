package ar.edu.info.oo2.filters_pipes;

import java.util.Map;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import ar.edu.info.oo2.filtros.*;
import ar.edu.info.oo2.pipes.ImageFilterPipe;
import builder.FilterBuilder;
import builder.MonochromeBuilder;
import builder.MultichromeBuilder;

import java.awt.image.BufferedImage;



public class PNGFilterLauncher {
  private static ImageFilter decorator;
  private static File inputFile;
  private static File outputFile;
  private static FilterBuilder builder;

  public static void main(String args[]) throws Exception {
    // Process the arguments
    if (args.length < 2) {
      System.out.println("Usage: java Main input-file output-file [--filter]");
      return;
    }
    PNGFilterLauncher.processArgs(args);

    // Read the image file
    BufferedImage image;
    try {
      image = ImageIO.read(inputFile);
    } catch(IOException exception) {
      System.err.println("Unable to read file: " + inputFile + "\n" + exception);
      return;
    }

    // Convert to 8-bit RGB Colorspace
    BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
    newImage.getGraphics().drawImage(image, 0, 0, null);
    image = decorator.filter(newImage);

    // Filter the image
    

    // Write the image file
    try {
      ImageIO.write(image, "png", outputFile);
    } catch(IOException exception) {
      System.err.println("Unable to write file: " + outputFile + "\n" + exception);
      return;
    }
  }

  static void processArgs(String args[]) throws Exception {
    // Get the input and output file values
    inputFile = new File(args[0]);
    outputFile = new File(args[1]);
    
    System.out.println(args[2]);
    if (args[2].trim().equals("--builder-monocromo")) {
        builder = new MonochromeBuilder();
    } else if (args[2].trim().equals("--builder-multicromo")) {
        builder = new MultichromeBuilder();
    }
    else {
    	throw new Exception("Unknown configuration");
    }

    Map<String, Consumer<FilterBuilder>> comandos = Map.of(
		    "--rainbow", FilterBuilder::agregarRainbow,
		    "--rgb-shifter", FilterBuilder::agregarRgbShifter,
		    "--artifacter", FilterBuilder::agregarArtifacter,
		    "--mono", FilterBuilder::agregarMonochrome
		);
    
    for (int i = 3; i < args.length; i++) {
      
      Consumer<FilterBuilder> action = comandos.get(args[i]);
      if (action == null) {
          System.err.println("Filtro desconocido: " + args[i]);
          continue;
      }
      action.accept(builder);
      
    }
    
    decorator = builder.build();
  }



  
}
