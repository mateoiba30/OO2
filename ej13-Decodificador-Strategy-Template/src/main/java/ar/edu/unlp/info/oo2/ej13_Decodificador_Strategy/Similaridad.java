package ar.edu.unlp.info.oo2.ej13_Decodificador_Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends EstrategiaSugerencia{
	
	public Similaridad() {
		
	}

	public List<Pelicula> elegirLista(Decodificador decodificador){
		return decodificador.getReproducidas().stream().map(p -> p.getSimilares()).flatMap(lista -> lista.stream()).distinct().collect(Collectors.toList());
	}
}
