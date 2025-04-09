package boletin4.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		
		// Creamos un arrayList para almacenar fichas
		ArrayList<Ficha> fichas = new ArrayList<Ficha>();
		
		
		// Creamos la ficha 1 y la añadimos al arrayList
		Ficha ficha1 = new Ficha(1, "Ficha de Historia");
		fichas.add(ficha1);
		 
		// Creamos la ficha 5 y la añadimos al arrayList
	    Ficha ficha5 = new Ficha(5, "Ficha de Literatura");
	    fichas.add(ficha5);
	    
		// Creamos la ficha 2 y la añadimos al arrayList
	    Ficha ficha2 = new Ficha(2, "Ficha de Matemáticas");
	    fichas.add(ficha2);
	    
	    // Creamos la ficha 4 y la añadimos al arrayList
	    Ficha ficha4 = new Ficha(4, "Ficha de Geografía");
	    fichas.add(ficha4);
	    
	    // Creamos la ficha 3 y la añadimos al arrayList
	    Ficha ficha3 = new Ficha(3, "Ficha de Biología");
	    fichas.add(ficha3);
	    
	   
	    // Ordenamos el arrayList usando el comparator con expresion lambda
	    fichas.sort((f1,f2) -> { return f1.getTitulo().compareTo(f2.getTitulo()); });
	    
	    // Imprimimos el arrayList
	    System.out.println("ORDEN ALFABÉTICO (lambda) \n" + fichas + "\n");
	    
	    
	    // Ordenamos el arrayList usando el comparable
	    Collections.sort(fichas);
	    
	    // Imprimimos el arrayList
	    System.out.println("ID ASC \n" + fichas + "\n");
	    
	    
	    // Ordenamos el arrayList usando el comparator
	    fichas.sort(new FichasOrdenAlfabetico());
	    
	    // Imprimimos el arrayList
	    System.out.println("ORDEN ALFABÉTICO \n" + fichas + "\n");
	    
	    
	     

	}

}
