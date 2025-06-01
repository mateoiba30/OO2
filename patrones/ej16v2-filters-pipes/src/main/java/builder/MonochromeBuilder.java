package builder;

import java.util.ArrayList;
import java.util.List;

import ar.edu.info.oo2.filtros.Artifacter;
import ar.edu.info.oo2.filtros.ImageFilter;
import ar.edu.info.oo2.filtros.Monochrome;
import ar.edu.info.oo2.filtros.RGBShifter;
import ar.edu.info.oo2.pipes.ImageFilterPipe;

public class MonochromeBuilder implements FilterBuilder{

    private ImageFilterPipe filters = new ImageFilterPipe();

    public void agregarRainbow() {
        // ignorado, no aplica a secuencia monocroma
    }

    public void agregarRgbShifter() {
        filters.addFilter(new RGBShifter());
    }

    public void agregarArtifacter() {
        filters.addFilter(new Artifacter());
    }

    public void agregarMonochrome() {
    	 filters.addFilter(new Monochrome());
    }

    public ImageFilter build() {
        agregarMonochrome();
        return filters;
    }

}
