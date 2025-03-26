package boletin3.ejercicio1;

import java.util.Scanner;

public class VehiculoMain {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String respuesta;
		
		System.out.println("BIENVENIDO a VehicleSimulation. Crea tu vehiculo!");
		
		System.out.println("¿Quieres arrancar el coche?");
		respuesta = reader.nextLine();
		
		if (respuesta.equalsIgnoreCase("si")) {
			//coche.arrancar();
		}

	}
	
	public static Vehiculo creaVehiculo() {
		
		Vehiculo vehiculo = null;
		
		int opcion;
		String respuesta;
		
		System.out.println("¿Qué quieres crear?");
		System.out.println("1. Turismo");
		System.out.println("2. Camion");
		System.out.println("3. Motocicleta\n");
		
		System.out.println("Introduzca una opcion");
		opcion = reader.nextInt();
		
		String marca;
		String modelo;
		String color;
		String matricula;

		System.out.println("Introduzca la marca");
		marca = reader.nextLine();
		
		System.out.println("Introduzca el modelo");
		modelo = reader.nextLine();
		
		System.out.println("Introduzca el color");
		color = reader.nextLine();
		
		System.out.println("Introduzca la matricula");
		matricula = reader.nextLine();
		
		switch (opcion) {
			case 1 -> { 
				
				int numeroPlazas;
				String uso;
				
				System.out.println("Introduzca el numero de plazas");
				numeroPlazas = reader.nextInt();
				
				System.out.println("Introduzca el uso del turismo: Profesional o Particular");
				uso = reader.nextLine().toUpperCase();
				
				vehiculo = new Turismo(marca, modelo, color, matricula, numeroPlazas, uso); 
			}
			case 2 -> {
				
				int pesoMaximoAutorizado;
				boolean mercanciaPeligrosa;
				
				System.out.println("Introduzca el peso maximo autorizado");
				pesoMaximoAutorizado = reader.nextInt();
				
				do {
					System.out.println("¿Transporta mercancias peligrosas? (Si/no)");
					respuesta = reader.nextLine().toUpperCase();
				} while (!respuesta.equalsIgnoreCase("si") || !respuesta.equalsIgnoreCase("no"));
				
				if (respuesta.equalsIgnoreCase("si")) {
					mercanciaPeligrosa = true;
				} else {
					mercanciaPeligrosa = false;
				}
				
				vehiculo = new Camion(marca, modelo, color, matricula, pesoMaximoAutorizado, mercanciaPeligrosa);
			}
			case 3 -> {
				
				int cilindrada;
				boolean requiereCarnet;
			}
		}
		
		return vehiculo;
	}

}
