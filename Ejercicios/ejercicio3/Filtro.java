package ejercicio3;

import java.util.List;

public abstract class Filtro {
	
	public Filtro() {
		super();
	}
	
	public abstract List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia);
	
}
