package boletin1.ejercicio5;

import java.util.ArrayList;

public class PoligonoCrud {

	private static ArrayList<Poligono> poligonos = new ArrayList<>();
	
	public static boolean añadirPoligono(Poligono p) {
		return poligonos.add(p);
	}
	
	public static void mostrarPoligonos() {
		for (Poligono p : poligonos) {
			System.out.println(p);
			System.out.println("ÁREA -> " + p.area());
		}
	}
}
