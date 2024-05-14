package ar.edu.unlp.info.oo2.ej13_Decodificador_Strategy;

import java.util.List;

public class Novedad extends EstrategiaSugerencia{
	
	public Novedad() {
		
	}
	
	public List<Pelicula> elegirLista(Decodificador decodificador){
		return decodificador.mostrarGrilla();
	}
}
