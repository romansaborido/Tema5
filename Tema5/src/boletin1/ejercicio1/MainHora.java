package boletin1.ejercicio1;

import java.util.Scanner;

public class MainHora {

	public static void main(String[] args) {
	
		int opcion;
		int hora;
		int minutos;
		int segundos;
		
		Scanner reader = new Scanner(System.in);
		
		do {
			
			menu();
			
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			switch (opcion) {
				case 1 -> {
					
					System.out.println("Introduzca la hora");
					hora = reader.nextInt();
					
					System.out.println("Introduzca los minutos");
					minutos = reader.nextInt();
					
					Hora Hora = new Hora(hora, minutos);
					
				
				}
				case 2 -> {
								
							}
				case 3 -> {
					
				}
				default -> {
					
				}
			}
			
			
		} while (opcion != 3);
		
		
	}
	
	static void menu() {
		System.out.println("HORA / HORA EXACTA");
		System.out.println("------------------");
		System.out.println("1. Hora");
		System.out.println("2. Hora exacta");
		System.out.println("3. Salir");
	}
	
	static void menuHora(Object obj) {
		System.out.println(obj);
		System.out.println("--------");
		System.out.println("1. Incrementar hora");
		System.out.println("2. Modificar hora");
		System.out.println("3. Modificar minutos");
	}
	
	static void menuHoraExacta(Object obj) {
		System.out.println(obj);
		System.out.println("--------");
		System.out.println("1. Incrementar hora");
		System.out.println("2. Modificar segundos");
		System.out.println("3. Modificar minutos");
	}

}
