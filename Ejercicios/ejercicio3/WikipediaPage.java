package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WikipediaPage {
	private List <WikipediaPage> links; 
	private String title;
	private Map<String, WikipediaPage> infoBox;
	
	
	
	public WikipediaPage(String title, List<WikipediaPage> links, Map<String, WikipediaPage> infoBox) {
		super();
		this.links = links;
		this.title = title;
		this.infoBox = infoBox;
	}
	
	public List<WikipediaPage> getLinks() {
		return links;
	}
	public String getTitle() {
		return title;
	}
	public Map<String, WikipediaPage> getInfoBox() {
		return infoBox;
	}

	
}
