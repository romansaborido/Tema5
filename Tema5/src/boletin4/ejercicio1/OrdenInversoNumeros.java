package boletin4.ejercicio1;

import java.util.Comparator;

public class OrdenInversoNumeros implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
	
}
