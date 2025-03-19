package boletin1.ejercicio5;

import java.util.Scanner;

public class PoligonoMain {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion;
		
		Poligono p;
		
		do {
			
			menu();
			
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			switch (opcion) {
				case 1 -> {
					
					p = creaTriangulo();
					
					if (PoligonoCrud.añadirPoligono(p)) {
						System.out.println("El tríangulo se añadió correctamente");
					} else {
						System.err.println("El tríangulo no se ha podido añadir");
					}
				}
				case 2 -> {
					
					p = creaRectangulo();
					
					if (PoligonoCrud.añadirPoligono(p)) {
						System.out.println("El rectángulo se añadió correctamente");
					} else {
						System.err.println("El rectángulo no se ha podido añadir");
					}
				}
				case 3 -> {
					
					PoligonoCrud.mostrarPoligonos();
				}
				case 4 -> {
					System.out.println("Fin del programa");
				}
				default -> {
					System.err.println("Introduzca una opcion válida");
				}
			}
		} while (opcion != 4);
	}
	
	
	private static void menu() {
		System.out.println("\n" + "--- Menú ---");
		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectángulo");
		System.out.println("3. Mostrar polígonos");
		System.out.println("4. Salir" + "\n");
	}
	
	
	private static Triangulo creaTriangulo() {
		
		int lado1;
		int lado2;
		int lado3;
		
		lado1 = lado1();
		
		lado2 = lado2();
		
		System.out.println("Introduzca la longitud del lado 3");
		lado3 = reader.nextInt();
		
		Triangulo t = new Triangulo(lado1, lado2, lado3); 
		
		return t;
	}

	
	private static Rectangulo creaRectangulo() {
		
		int lado1;
		int lado2;
		
		lado1 = lado1();
		
		lado2 = lado2();
	
		Rectangulo r = new Rectangulo(lado1, lado2); 
		
		return r;
	}
	
	
	private static int lado1() {
		
		int lado1;
		
		System.out.println("Introduzca la longitud del lado 1");
		lado1 = reader.nextInt();
		
		return lado1;
	}


	private static int lado2() {
		
		int lado2;
		
		System.out.println("Introduzca la longitud del lado 2");
		lado2 = reader.nextInt();
		
		return lado2;
	}
	
	
}
