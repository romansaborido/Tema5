package boletin1.ejercicio4;

public class Electrodomestico {
	
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	enum ConsumoEnergetico {
		A, B, C, D, E, F 
	}
	
	private double precioBase = 100;
	
	private Color color = Color.BLANCO;
	
	private ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;
	
	private double peso = 5;
	
	
	public Electrodomestico(double precio, double peso, String color, char consumoEnergetico) {
		
		if (precio > 0) {
			this.precioBase = precio;
		}
		
		if (peso > 0) {
			this.peso = peso;
		}
		
		if (comprobarConsumoEnergetico(consumoEnergetico)) {
			String consumo = String.valueOf(consumoEnergetico);
			this.consumoEnergetico = ConsumoEnergetico.valueOf(consumo);
		}
		
		if (comprobarColor(color)) {
			this.color = Color.valueOf(color);
		}
	}
	
	public Electrodomestico(double precio, double peso) {
		
		if (precio > 0) {
			this.precioBase = precio;
		}
		
		if (peso > 0) {
			this.peso = peso;
		}
	}
	
	
	public double getPrecioBase() {
		return this.precioBase;
	}
	
	public String getColor() {
		return String.valueOf(this.color);
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public String getConsumoEnergetico() {
		return String.valueOf(this.consumoEnergetico);
	}
	
	
	// FALTAN SETTERS
	
	
	private boolean comprobarConsumoEnergetico(char letra) {
		
		boolean res = false;
		
		switch (letra) {
			case 'A', 'B', 'C', 'D', 'E', 'F' -> { res = true; }
		}
		
		return res;
	}
	
	private boolean comprobarColor(String color) {
		
		boolean res = false;
		
		switch (color) {
			case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> { res = true; } 
		}
		
		return res;
	}
	
	
}
	

