package boletin4.ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
	
	public static void main(String[] args) {
		
		// Creamos el arraylist socios
		ArrayList<Socio> socios = new ArrayList<>();
		
		// Creamos cuatro socios y lo añadimos al arra
        Socio socio1 = new Socio(1, "Juan", 30);
        Socio socio2 = new Socio(2, "Ana", 25);
        Socio socio3 = new Socio(3, "Carlos", 40);
        Socio socio4 = new Socio(4, "Maria", 35);

        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
		
		// Creamos el comparador de los nombres creando una clase anonima
		Comparator<Socio> nombres = new Comparator<Socio>() {

			@Override
			public int compare(Socio s1, Socio s2) {
				return s1.getNombre().compareTo(s2.getNombre());
			}
		};
		
		// Ordenamos el arrayList mediante el comparador
		socios.sort(nombres);
		
		// Imprimimos el arrayList
		System.out.println("\nCLASE ANONIMA -> NOMBRES ORDEN ALFABETICO");
		System.out.println(socios);
		
		
		// Creamos el comparador de las edades creando una clase anonima
		Comparator<Socio> edades = new Comparator<Socio>() {
			
			@Override
			public int compare(Socio s1, Socio s2) {
				return s2.getEdad() - s1.getEdad();
			}
		};
		
		// Ordenamos el arrayList mediante las edades desc
		socios.sort(edades);
		
		// Imprimimos el arrayList
		System.out.println("\nCLASE ANONIMA -> EDADES MAYOR A MENOR");
		System.out.println(socios);
		
		
		// Creamos el comparador lambda para los nombres
		Comparator<Socio> nombres2 = (s1, s2) -> { return s1.getNombre().compareTo(s2.getNombre()); };
		
		// Probamos el comparador nombres2
		socios.sort(nombres2);
		System.out.println("\nLAMBDA -> NOMBRES ORDEN ALFABETICO");
		System.out.println(socios);
		
		
		// Creamos el comparador lambda para las edades
		Comparator<Socio> edades2 = (s1, s2) -> { return s2.getEdad() - s1.getEdad(); };
		
		// Probamos el comparador edades2
		socios.sort(edades2);
		System.out.println("\nLAMBDA -> EDADES MAYOR A MENOR");
		System.out.println(socios);
		
		
		
		// Probamos el comparador creado en una clase a parte
		socios.sort(new OrdenAlfabetico());
		System.out.println("\nCLASE A PARTE -> NOMBRES ORDEN ALFABETICO");
		System.out.println(socios);
		
		// Probamos el comparador creado en una clase a parte
		socios.sort(new OrdenEdadInverso());
		System.out.println("\nCLASE A PARTE -> EDADES MAYOR A MENOR");
		System.out.println(socios);
		
		
		
	}
	
}
