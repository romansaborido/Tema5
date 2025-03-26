package boletin2.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico {

	public Perro(String nombre, String raza, int peso, String color) {
		super(nombre, raza, peso, color);
	}

	public void sacarPaseo() {
		System.out.println("Vamos a la calle. Guau guau guau!");
	}
	
	@Override
	public boolean hacerCaso() {
		boolean res = false;
		
		Random rand = new Random();
		
		int caso = rand.nextInt(0,5);
		
		if (caso >= 0 && caso <= 3) {
			res = true;
		}
		
		return res;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau, guau, guau");
	}
	
	
}
