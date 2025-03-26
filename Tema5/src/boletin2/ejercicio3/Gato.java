package boletin2.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico {

	public Gato(String nombre, String raza, int peso, String color) {
		super(nombre, raza, peso, color);
	}
	
	public void toserBolaPelo() {
		System.out.println("Ajka, ajka, aaajjka");
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("Miau, miau, miau");
	}
	
	@Override
	public boolean hacerCaso() {
		boolean res = false;
		
		Random rand = new Random();
		
		int caso = rand.nextInt(0,5);
		
		if (caso == 4) {
			res = true;
		}
		
		return res;
	}
}
