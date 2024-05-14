package ar.edu.unlp.info.oo2.ej13_Decodificador_Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends EstrategiaSugerencia{
	
	public Puntaje() {
		
	}
	
	public List<Pelicula> elegirLista(Decodificador decodificador){
		return decodificador.mostrarGrilla().stream().sorted((p2, p1) -> p1.compararPuntaje(p2)).collect(Collectors.toList());
	}
	
}
