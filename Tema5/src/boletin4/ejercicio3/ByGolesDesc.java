package boletin4.ejercicio3;

import java.util.Comparator;

public class ByGolesDesc implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista f1, Futbolista f2) {
		return f2.getGoles() - f1.getGoles();
	}
	
	
}
