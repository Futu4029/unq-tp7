package test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio3.*;

class TestWiki {
	private WikipediaPage buenosAires;
	private WikipediaPage brazil;
	private WikipediaPage carton;
	private List<WikipediaPage> list = new ArrayList<WikipediaPage>();
	private List<WikipediaPage> list2 = new ArrayList<WikipediaPage>();
	private List<WikipediaPage> listaResultado = new ArrayList<WikipediaPage>();
	private Map<String, WikipediaPage> map = new HashMap<String, WikipediaPage>();
	private Map<String, WikipediaPage> map2 = new HashMap<String, WikipediaPage>();
	private Filtro filter1 = new MismaLetra();
	private Filtro filter2 = new LinksEnComun();
	private Filtro filter3 = new PropiedadEnComun();
	
	@BeforeEach
	public void setUp() {
		buenosAires = new WikipediaPage("Buenos Aires", list, map2);
		brazil = new WikipediaPage("Brazil", list2, map);
		carton = new WikipediaPage("Carton", list2, map);
		list.add(buenosAires);
		list.add(brazil);
		list.add(carton);
		list2.add(brazil);
		list2.add(carton);
		map.put("Brazil", carton);
		map.put("Brazil", carton);
		map2.put("Brazil", brazil);
		map2.put("Brazil", buenosAires);
	}
	
	@Test
	void mismaLetraInicialTest() {
		listaResultado.add(buenosAires);
		listaResultado.add(brazil);
		assertEquals(listaResultado, filter1.getSimilarPages(brazil, list));
	}
	
	@Test
	void linkEnComun() {
		listaResultado.add(brazil);
		listaResultado.add(carton);
		assertEquals(listaResultado, filter2.getSimilarPages(buenosAires, list2));
	}
	@Test
	void propiedadEnComun() {
		listaResultado.add(brazil);
		listaResultado.add(carton);
		assertEquals(listaResultado, filter3.getSimilarPages(buenosAires, list2));
	}
}

