package boletin4.ejercicio3;

import java.util.Comparator;

public class ByEdadAsc implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista f1, Futbolista f2) {
		return f1.getEdad() - f2.getEdad();
	}

	
		
	
}
