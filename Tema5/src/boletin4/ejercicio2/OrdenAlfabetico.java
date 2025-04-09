package boletin4.ejercicio2;

import java.util.Comparator;

public class OrdenAlfabetico implements Comparator<Socio> {

	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.getNombre().compareTo(s2.getNombre());
	}
	
	
}
