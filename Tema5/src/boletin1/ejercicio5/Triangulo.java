package boletin1.ejercicio5;

public class Triangulo extends Poligono {

	private double lado1 = 1;
	private double lado2 = 1;
	private double lado3 = 1;
	
	public Triangulo() {
		super(3);
	}
	
	public Triangulo(int lado1, int lado2, int lado3) {
		super(3);
		
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}
	
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	public double getLado2() {
		return this.lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	@Override
	public double area() {

		// Calcular el semiperímetro
		double s = (this.lado1 + this.lado2 + this.lado3) / 2;

		// Calcular el área utilizando la fórmula de Herón
		double area = Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
		
		return area;
	}
	
	@Override
	public String toString() {
		return
		"--- TRIÁNGULO ---" + "\n" +
		super.toString() + 
		"LADO 1 -> " + this.lado1 + "\n" +						  
		"LADO 2 -> " + this.lado2 + "\n" +
		"LADO 3 -> " + this.lado3;
	}
}
