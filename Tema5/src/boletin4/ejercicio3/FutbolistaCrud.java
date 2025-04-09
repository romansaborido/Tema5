package boletin4.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FutbolistaCrud {

	private static ArrayList<Futbolista> futbolistas = new ArrayList<>();
	
	public static void listarFutbolistas() {
		for (Futbolista f : futbolistas) {
			System.out.println(f);
			System.out.println("--------------");
		}
	}
	
	public static boolean añadirFutbolista(Futbolista f) {
		boolean res = false;
		if (!futbolistas.contains(f)) {
			res = futbolistas.add(f);
		}
		return res;
	}
	
	public static boolean eliminarFutbolista(Futbolista f) {
		return futbolistas.remove(f);
	}
	
	public static void ordenarFutbolistas() {
		Collections.sort(futbolistas);
	}
	
	public static void ordenarFutbolistasComp(Comparator<Futbolista> comp) {
		futbolistas.sort(comp);
	}
	
	
	
}
