package boletin2.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class SocioCrud {
	
	private static ArrayList<Socio> socios = new ArrayList<>();
	
	public static void listadoSocios() {
		for (Socio s : socios) {
			System.out.println(s);
			System.out.println("-----------");
		}
	}
	
	public static boolean añadirSocio(Socio s) {
		return socios.add(s);
	}
	
	public static boolean eliminarSocio(Socio s) {
		return socios.remove(s);
	}
	
	public static void ordenarLista() {
		Collections.sort(socios);
	}
	

}
