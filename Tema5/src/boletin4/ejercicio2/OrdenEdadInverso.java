package boletin4.ejercicio2;

import java.util.Comparator;

public class OrdenEdadInverso implements Comparator<Socio> {

	@Override
	public int compare(Socio s1, Socio s2) {
		return s2.getEdad() - s1.getEdad();
	}
	
	
}
