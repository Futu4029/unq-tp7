package ejercicio3;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LinksEnComun extends Filtro{

public List <WikipediaPage> getSimilarPages(WikipediaPage pageOriginal, List <WikipediaPage> wikiList){
	return wikiList.stream().filter(pag -> this.compararLinks(pageOriginal, pag))
			.collect(Collectors.toList());	
	}

public boolean compararLinks(WikipediaPage pageOriginal, WikipediaPage pageComparar){
	return pageOriginal.getLinks().stream()
			.anyMatch(linksOriginal -> pageComparar.getLinks().contains(linksOriginal));	
	}

/*public List <WikipediaPage> getSimilarPages(WikipediaPage pageOr, List <WikipediaPage> wikiList){
return wikiList.stream().map(pag -> this.compararLinks(pag, pageOr.getLinks()))
		.flatMap(Collection::stream)
		.collect(Collectors.toList());	
}

public List <WikipediaPage> compararLinks(WikipediaPage pageOr, List <WikipediaPage> wikiList){
return wikiList.stream().filter(pag -> pageOr.equals(pag))
		.collect(Collectors.toList());
}*/
}