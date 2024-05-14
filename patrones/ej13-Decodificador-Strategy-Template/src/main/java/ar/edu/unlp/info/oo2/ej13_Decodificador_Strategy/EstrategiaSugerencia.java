package ar.edu.unlp.info.oo2.ej13_Decodificador_Strategy;

import java.util.List;
import java.util.stream.Collectors;

public abstract class EstrategiaSugerencia {

	public List<Pelicula> sugerir3Peliculas(Decodificador decodificador){
		return elegirLista(decodificador).stream().sorted((p2, p1) -> p1.compararAnio(p2)).limit(3).collect(Collectors.toList());
	}
	//p1.comparar(p2))
	public abstract List<Pelicula> elegirLista(Decodificador decodificador);
}
