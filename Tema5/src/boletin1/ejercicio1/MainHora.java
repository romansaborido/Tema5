package boletin1.ejercicio1;

import java.util.Scanner;

public class MainHora {

	public static void main(String[] args) {
	
		// Creamos estas variables para almacenar los valores del objeto
		int opcion;
		int hora;
		int minutos;
		int segundos;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Mientras que el usuario no seleccione la opcion 3
		do {
			
			// Pintamos el menu
			menu();
			
			// Pedimos al usuario que introduzca una opcion
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			// Dependiendo de la opcion que seleccione el usuario
			switch (opcion) {
			
				// Hora
				case 1 -> {
					
					// Pedimos al usuario que introduzca la hora
					System.out.println("\n" + "Introduzca la hora");
					hora = reader.nextInt();
					
					// Pedimos al usuario que introduzca los minutos
					System.out.println("Introduzca los minutos");
					minutos = reader.nextInt();
					
					// Creamos el objeto hora
					Hora Hora = new Hora(hora, minutos);
					
					// Mientras que el usuario no seleccione la opcion 4
					do {
						
						// Imprimimos el menu
						menuHora(Hora);
						
						// Pedimos al usuario que introduzca una opcion
						System.out.println("Introduzca una opcion");
						opcion = reader.nextInt();
						
						// Dependiendo de la opcion que seleccione el usuario
						switch (opcion) {
						
							// Incrementar hora
							case 1 -> {
								
								// Incrementamos la hora
								Hora.inc();
							}
							
							// Modificar hora
							case 2 -> {
								
								// Pedimos al usuario que introduzca la hora nueva
								System.out.println("\n" + "Introduzca la hora nueva");
								hora = reader.nextInt();
								
								// Modificamos la hora
								Hora.setHora(hora);
							}
							
							// Modificar minutos
							case 3 -> {
								
								// Pedimos al usuario que introduzca los minutos nuevos
								System.out.println("\n" + "Introduzca los minutos nuevos");
								minutos = reader.nextInt();
								
								// Modificamos los minutos
								Hora.setMinutos(minutos);
							}
							
							// Salir
							case 4 -> {
							}
							
							// Opcion no valida
							default -> {
								System.out.println("\n" + "Introduzca una opción válida");
							}
						}	
					} while (opcion != 4);
				}
				
				// Hora exacta
				case 2 -> {
					
					// Pedimos al usuario que introduzca la hora
					System.out.println("\n" + "Introduzca la hora");
					hora = reader.nextInt();
					
					// Pedimos al usuario que introduzca los minutos
					System.out.println("Introduzca los minutos");
					minutos = reader.nextInt();
					
					// Pedimos al usuario que introduzca los segundos
					System.out.println("Introduzca los segundos");
					segundos = reader.nextInt();
					
					// Creamos el objeto hora exacta
					HoraExacta HoraExacta = new HoraExacta(hora, minutos, segundos);
					
					// Mientras que el usuario no seleccione la opcion 4
					do {
						
						// Imprimimos el menu
						menuHoraExacta(HoraExacta);
						
						// Pedimos al usuario que introduzca una opcion
						System.out.println("Introduzca una opcion");
						opcion = reader.nextInt();
						
						// Dependiendo de la opcion que seleccione el usuario
						switch (opcion) {
						
							// Incrementar hora
							case 1 -> {
								
								// Incrementamos la hora
								HoraExacta.inc();
							}
							
							// Modificar segundos
							case 2 -> {
								
								// Pedimos al usuario que introduzca los segundos
								System.out.println("\n" + "Introduzca los segundos");
								segundos = reader.nextInt();
								
								// Modificamos los segundos
								HoraExacta.setSegundo(segundos);
							}
							
							// Modificar minutos
							case 3 -> {
								
								// Pedimos al usuario que introduzca los minutos
								System.out.println("\n" + "Introduzca los minutos");
								minutos = reader.nextInt();
								
								// Modificamos los minutos
								HoraExacta.setMinutos(minutos);
							}
							
							// Salir
							case 4 -> {
							}
							
							// Opcion no valida
							default -> {
								System.out.println("\n" + "Introduzca una opción válida");
							}
						}
					} while (opcion != 4);
				}
				
				// Salir
				case 3 -> {
					System.out.println("\n" + "Fin del programa");
				}
				
				// Opcion no valida
				default -> {
					System.err.println("\n" + "Introduzca una opción válida");
				}
			}
		} while (opcion != 3);
		
		
		// Cerramos el scanner
		reader.close();
	}
	
	static void menu() {
		System.out.println("\n" + "HORA / HORA EXACTA");
		System.out.println("------------------");
		System.out.println("1. Hora");
		System.out.println("2. Hora exacta");
		System.out.println("3. Salir" + "\n");
	}
	
	static void menuHora(Object obj) {
		System.out.println("\n" + obj);
		System.out.println("--------");
		System.out.println("1. Incrementar hora");
		System.out.println("2. Modificar hora");
		System.out.println("3. Modificar minutos");
		System.out.println("4. Salir" + "\n");
	}
	
	static void menuHoraExacta(Object obj) {
		
		System.out.println("\n" + obj);
		System.out.println("--------");
		System.out.println("1. Incrementar hora");
		System.out.println("2. Modificar segundos");
		System.out.println("3. Modificar minutos");
		System.out.println("4. Salir" + "\n");
	}
	
}
