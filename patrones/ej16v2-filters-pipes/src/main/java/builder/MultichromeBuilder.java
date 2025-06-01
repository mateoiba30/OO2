package builder;

import ar.edu.info.oo2.filtros.Artifacter;
import ar.edu.info.oo2.filtros.ImageFilter;
import ar.edu.info.oo2.filtros.Monochrome;
import ar.edu.info.oo2.filtros.RGBShifter;
import ar.edu.info.oo2.filtros.Rainbow;
import ar.edu.info.oo2.pipes.ImageFilterPipe;

public class MultichromeBuilder implements FilterBuilder{
	private ImageFilterPipe filters = new ImageFilterPipe();

    public void agregarRainbow() {
    	filters.addFilter(new Rainbow()); 
    }

    public void agregarRgbShifter() {
        filters.addFilter(new RGBShifter());
    }

    public void agregarArtifacter() {
        filters.addFilter(new Artifacter());
    }

    public void agregarMonochrome() {
    	// ignorado, no aplica a secuencia multicroma
    }

    public ImageFilter build() {
        return filters;
    }
}
