package ar.edu.info.oo2.filtros;

import java.util.List;

import ar.edu.info.oo2.pipes.ImageFilterPipe;

public abstract class Constructor {
	
	private List<AbstractFilter> secuencia;

	public void agregarArtifacter() {
		this.secuencia.add(new Artifacter());
	}
	
	public void agregarDull() {
		this.secuencia.add(new Dull());
	}
	
	public void agregarRepeater() {
		this.secuencia.add(new Repeater());
	}
	
	public void agregarRGBShifter() {
		this.secuencia.add(new RGBShifter());
	}
	
	public void agregarRGBShifterRepeater() {
		this.secuencia.add(new RGBShiftRepeater());
	}
	
	public abstract Constructor agregarCromatico();
	
	public abstract void finalizar();
	
	public ImageFilterPipe crear() {
		ImageFilterPipe pipe = new ImageFilterPipe(secuencia.get(0));
		for filter in secuencia:
			pipe.addFilter(filter);
		this.finalizar(pipe);
		return pipe;
	}
	
}
