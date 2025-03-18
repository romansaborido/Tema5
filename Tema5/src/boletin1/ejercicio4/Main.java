package boletin1.ejercicio4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
		
		// Electrodomesticos
		Electrodomestico e1 = new Electrodomestico(50.00, 24.00, "NEGRO", 'B');
		Electrodomestico e2 = new Electrodomestico(75.00, 30.00, "BLANCO", 'A'); 
		Electrodomestico e3 = new Electrodomestico(120.00, 50.00, "GRIS", 'C'); 
		
		// Lavadoras
		Lavadora l1 = new Lavadora(10.00, 10.00);
		Lavadora l2 = new Lavadora(99.99, 38, "BLANCO", 'C', 200);
		Lavadora l3 = new Lavadora(150.00, 45.00);
		Lavadora l4 = new Lavadora(120.50, 35.00, "AZUL", 'A', 150);
		
		// Television
		Television t1 = new Television(28.00, 42.00);
		Television t2 = new Television(10.00, 23.5, "ROJO", 'E', 1000, true);
		Television t3 = new Television(32.00, 55.00);
		Television t4 = new Television(50.00, 75.00, "NEGRO", 'A', 1200, false); 
		
		// Añadimos los electrodomesticos
		electrodomesticos.add(e1);
        electrodomesticos.add(e2);
        electrodomesticos.add(e3);
        
        // Añadimos las lavadoras
        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        electrodomesticos.add(l3);
        electrodomesticos.add(l4);
        
        // Añadimos las televisiones
        electrodomesticos.add(t1);
        electrodomesticos.add(t2);
        electrodomesticos.add(t3);
        electrodomesticos.add(t4);
        
        
        double precioElectrodomesticos = 0;
        double precioLavadoras = 0;
        double precioTelevisiones = 0;
        
        // Recorremos la lista
        for (Electrodomestico e : electrodomesticos) {
        	
        	if (e instanceof Lavadora lavadora) {
        		lavadora.precioFinal();
        		precioElectrodomesticos += lavadora.getPrecioBase();
        		precioLavadoras += lavadora.getPrecioBase();
        	} else if (e instanceof Television tv){
        		tv.precioFinal();
        		precioElectrodomesticos += tv.getPrecioBase();
        		precioTelevisiones += tv.getPrecioBase();
        	}
        }
        
        System.out.println("PRECIO ELECTRODOMESTICOS -> " + precioElectrodomesticos);
        System.out.println("PRECIO LAVADORAS -> " + precioLavadoras);
        System.out.println("PRECIO TELEVISIONES -> " + precioTelevisiones);
		
	}

}
