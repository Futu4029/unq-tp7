package ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class PropiedadEnComun extends Filtro{

	public List <WikipediaPage> getSimilarPages(WikipediaPage page, List <WikipediaPage> wikiList) {
		return wikiList.stream().filter(paginaComparada -> this.compararPropiedades(page, paginaComparada))
				.collect(Collectors.toList());
	}
	
	public boolean compararPropiedades(WikipediaPage paginaOriginal, WikipediaPage paginaComparada) {
		return paginaOriginal.getInfoBox().keySet().stream()
				.anyMatch(pagOriginal -> paginaComparada.getInfoBox().keySet().contains(pagOriginal));

	}
	
}
