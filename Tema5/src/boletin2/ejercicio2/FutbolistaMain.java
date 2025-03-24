package boletin2.ejercicio2;

import java.util.Scanner;

public class FutbolistaMain {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion;

		do {
			
			menu();
			
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			switch (opcion) {
				case 1 -> {
					
				}
				case 2 -> {
								
				}
				case 3 -> {
					
				}
				case 4 -> {
					
				}
				default -> {
					
				}
			}
			
		} while (opcion != 4);

	}
	
	
	private static void menu() {
		System.out.println("\n" + "--- Menú ---");
		System.out.println("1. Listar futbolistas");
		System.out.println("2. Añadir futbolista");
		System.out.println("3. Eliminar futbolista" + "\n");
	}
	
	
	private static Futbolista creaFutbolista() {
		
		String nombre;
		int dorsal;
		int edad;
		int goles;
		
		System.out.println("Introduzca el nombre");
		nombre = reader.nextLine();
		
		System.out.println("Introduzca el dorsal");
		dorsal = reader.nextInt();
		
		System.out.println("Introduzca la edad");
		edad = reader.nextInt();
		
		System.out.println("Introduzca los goles que ha marcado");
		goles = reader.nextInt();
		
		Futbolista f = new Futbolista(nombre, dorsal, edad, goles);
		
		return f;
	}

}
