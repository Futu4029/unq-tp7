package ejercicio7;

import javax.swing.DefaultListModel;

@SuppressWarnings("serial") // Same-version serialization only
public class PalabrasOrdenadasAdapter extends DefaultListModel<String>{
	    private ListaDePalabrasOrdenadas lista = new ListaDePalabrasOrdenadas();
	    
	    
   	    public void addElement(String elemento) {
	        lista.agregarPalabra(elemento);
	    }

	    @Override
	    public String get(int index) {
	        return lista.getPalabraDePosicion(index);
	    }

	    @Override
	    public int size() {
	        return lista.cantidadDePalabras();
	    }
}
