package boletin1.ejercicio5;

public abstract class Poligono {

	private int numeroLados;
	
	public Poligono(int numeroLados) {
		if (numeroLados == 3 || numeroLados == 4) {
			this.numeroLados = numeroLados;
		}
	}
	
	public int getNumeroLados() {
		return this.numeroLados;
	}
	
	@Override
	public String toString() {
		return "Nº LADOS -> " + this.numeroLados + "\n";
	}
	
	public abstract double area();
}
