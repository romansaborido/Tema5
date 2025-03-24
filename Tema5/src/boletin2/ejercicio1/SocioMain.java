package boletin2.ejercicio1;

import java.util.Scanner;

public class SocioMain {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion;
		
		Socio s;
		
		do {
			
			menu();
			
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			switch (opcion) {
				case 1 -> {
					s = creaSocio();
					
					if (SocioCrud.añadirSocio(s)) {
						System.out.println("El socio se ha agregado correctamente");
					} else {
						System.out.println("El socio no se ha podido añadir");
					}
				}
				case 2 -> {
					s = creaSocioPk();
					
					if (SocioCrud.eliminarSocio(s)) {
						System.out.println("El socio se ha eliminado correctamente");
					} else {
						System.out.println("El socio no se ha podido eliminar");
					}
				}
				case 3 -> {
					SocioCrud.ordenarLista();
					
					SocioCrud.listadoSocios();
				}
				case 4 -> {
					System.out.println("Fin del programa");
				}
				default -> {
					System.out.println("Introduzca una opción válida");
				}
			}
		} while (opcion != 4);
		
		reader.close();

	}
	
	
	private static void menu() {
		System.out.println("--- Menú ---");
		System.out.println("1. Añadir socio");
		System.out.println("2. Eliminar socio");
		System.out.println("3. Listar socios");
	}
	
	private static Socio creaSocio() {
		
		int id;
		String nombre;
		int edad;
		
		System.out.println("Introduzca el id");
		id = reader.nextInt();
		reader.nextLine();
		
		System.out.println("Introduzca el nombre");
		nombre = reader.nextLine();
		
		System.out.println("Introduzca la edad");
		edad = reader.nextInt();
		
		Socio socio = new Socio(id, nombre, edad);
		
		return socio;
	}
	
	
	private static Socio creaSocioPk() {
		
		int id;
		
		System.out.println("Introduzca el id");
		id = reader.nextInt();
		reader.nextLine();
		
		Socio socio = new Socio(id);
		
		return socio;
	}

}
