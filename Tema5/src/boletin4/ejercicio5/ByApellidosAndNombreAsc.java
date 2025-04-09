package boletin4.ejercicio5;

import java.util.Comparator;

public class ByApellidosAndNombreAsc implements Comparator <Titular> {

	@Override
	public int compare(Titular t1, Titular t2) {
		
		int res = t1.getApellidos().compareTo(t2.getApellidos());
		
		if (res == 0) {
			res = t1.getNombre().compareTo(t2.getNombre());
		}
		
		return res;
	}

}
