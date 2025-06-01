package builder;

import java.util.List;

import ar.edu.info.oo2.filtros.ImageFilter;

public interface FilterBuilder {

	void agregarRainbow();
    void agregarRgbShifter();
    void agregarArtifacter();
    void agregarMonochrome();
    ImageFilter build();
}
