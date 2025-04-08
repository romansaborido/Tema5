package boletin4.ejercicio3;

import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		
		// Creamos este comparador para ordenar los futbolistas por edad de manera ascendente
		Comparator<Futbolista> byEdadAsc = (f1, f2) -> { return f1.getEdad() - f2.getEdad(); };
		
		// Creamos este comparador para ordenar los futbolistas de mas goles a menos goles
		Comparator<Futbolista> byGolesDesc = (f1, f2) -> { return f2.getGoles() - f1.getGoles(); };
		
		
		// Creamos futbolistas
		Futbolista f1 = new Futbolista("Lionel Messi", 10, 36, 800);
		Futbolista f2 = new Futbolista("Cristiano Ronaldo", 7, 39, 850);
		Futbolista f3 = new Futbolista("Kylian Mbappé", 7, 25, 300);
		Futbolista f4 = new Futbolista("Erling Haaland", 9, 24, 200);
		Futbolista f5 = new Futbolista("Pedri González", 8, 21, 25);
		
		// Añadimos futbolistas
		FutbolistaCrud.añadirFutbolista(f1);
		FutbolistaCrud.añadirFutbolista(f2);
		FutbolistaCrud.añadirFutbolista(f3);
		FutbolistaCrud.añadirFutbolista(f4);
		FutbolistaCrud.añadirFutbolista(f5);
		
		
		// Ordenamos los futbolistas utilizando el comparator de las edades
		FutbolistaCrud.ordenarFutbolistasComp(byEdadAsc);
		
		// Imprimimos los futbolistas
		FutbolistaCrud.listarFutbolistas();
		
		System.out.println();
		
		// Ordenamos los futbolistas utilizando el comparator de los goles
		FutbolistaCrud.ordenarFutbolistasComp(byGolesDesc);
		
		// Imprimimos los futbolistas
		FutbolistaCrud.listarFutbolistas();
		

		
		
		

	}

}
