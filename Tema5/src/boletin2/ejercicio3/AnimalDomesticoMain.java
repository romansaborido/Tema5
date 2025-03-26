package boletin2.ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class AnimalDomesticoMain {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		AnimalDomestico animalDomestico = null;
		
		int opcion;
		
		System.out.println("BIENVENIDO a ANIMAL DOMESTICO");
		
		do {
			
			animalDomestico();
			
			System.out.println("Seleccione una mascota");
			opcion = reader.nextInt();
			reader.nextLine();
			
			if (opcion != 3) {
				animalDomestico = creaAnimalDomestico(opcion);
			}
			
			switch (opcion) {
				case 1 -> {
					Perro perro = (Perro) animalDomestico;
					
					do {
						System.out.println("\n" + "--- " + perro.getNombre() + " ---");
						perro();
						
						System.out.println("Seleccione una opcion");
						opcion = reader.nextInt();
						reader.nextLine();
						
						switch (opcion) {
							case 1 -> { perro.sacarPaseo(); }
							case 2 -> {
								Random rand = new Random();
								
								int accion = rand.nextInt(1,4);
								
								switch (accion) {
								case 1 -> { System.out.print("Tu perro está comiendo -> "); perro.comer(); }
								case 2 -> { System.out.print("Tu perro está durmiendo -> "); perro.dormir(); }
								case 3 -> { System.out.print("Tu perro está ladrando -> "); perro.hacerRuido(); }
								}
							}
							case 3 -> { perro.vacunar(); }
							case 4 -> {
								if (perro.hacerCaso()) {
									System.out.println(perro.getNombre() + " te ha dado la patita, buen chico");
								} else {
									System.out.println(perro.getNombre() + " no te da la patita");
								}
							}
							case 5 -> {}
							default -> { System.out.println("Introduzca una opcion valida"); }
						}
					} while (opcion != 5);
				}
				case 2 -> {
					Gato gato = (Gato) animalDomestico;
					
					do {
						System.out.println("\n" + "--- " + gato.getNombre() + " ---");
						gato();
						
						System.out.println("Seleccione una opcion");
						opcion = reader.nextInt();
						reader.nextLine();
						
						switch (opcion) {
							case 1 -> {
								Random rand = new Random();
								
								int accion = rand.nextInt(1,5);
								
								switch (accion) {
									case 1 -> { System.out.print("Tu gato está comiendo -> "); gato.comer(); }
									case 2 -> { System.out.print("Tu gato está durmiendo -> "); gato.dormir(); }
									case 3 -> { System.out.print("Tu gato está maullando -> "); gato.hacerRuido(); }
									case 4 -> { System.out.print("Tu gato está tosiendo una bola de pelo -> "); gato.toserBolaPelo(); }
								}
							}
							case 2 -> { gato.vacunar(); }
							case 3 -> {
								if (gato.hacerCaso()) {
									System.out.println(gato.getNombre() + " ha obedecido");
								} else {
									System.out.println(gato.getNombre() + " no viene, no te hace caso");
								}
							}
							case 4 -> {}
							default -> { System.out.println("Introduzca una opcion valida"); }
						}
					} while (opcion != 4);
					}
					case 3 -> {
						System.out.println("[!] Saliste del programa");
					}
					default -> {
						System.out.println("Introduzca una opcion valida");
					}
			}
			
			
		} while (opcion != 3);

	}
	
	public static void animalDomestico() {
		System.out.println("\n" + "--- Animal Domestico ---");
		System.out.println("1. Perro");
		System.out.println("2. Gato");
		System.out.println("3. Salir" + "\n");
	}
	
	public static void perro() {
		System.out.println("1. Sacarlo de paseo");
		System.out.println("2. Dejarlo en casa");
		System.out.println("3. Vacunarlo");
		System.out.println("4. Pedirle la patita");
		System.out.println("5. Salir" + "\n");
	}
	
	public static void gato() {
		System.out.println("1. Dejarlo en casa");
		System.out.println("2. Vacunarlo");
		System.out.println("3. Llamarlo");
		System.out.println("4. Salir" + "\n");
	}
	
	public static AnimalDomestico creaAnimalDomestico(int opcion) {
		
		AnimalDomestico animalDomestico;
		
		String nombre;
		String raza;
		int peso;
		String color;
		
		System.out.println("\n" + "Introduzca el nombre");
		nombre = reader.nextLine();
		
		System.out.println("Introduzca la raza");
		raza = reader.nextLine();
		
		System.out.println("Introduzca el peso");
		peso = reader.nextInt();
		reader.nextLine();
		
		System.out.println("Introduzca el color");
		color = reader.nextLine();
		
		if (opcion == 1) {
			animalDomestico = new Perro(nombre, raza, peso, color);
		} else {
			animalDomestico = new Gato(nombre, raza, peso, color);
		}
		
		return animalDomestico;
	}

}
