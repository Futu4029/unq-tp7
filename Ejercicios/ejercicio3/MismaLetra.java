package ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class MismaLetra extends Filtro{
	
	public List <WikipediaPage> getSimilarPages(WikipediaPage page, List <WikipediaPage> wikiList) {
		return wikiList.stream().filter(
				pag -> pag.getTitle().charAt(0) == page.getTitle().charAt(0))
				.collect(Collectors.toList());
	}
}
