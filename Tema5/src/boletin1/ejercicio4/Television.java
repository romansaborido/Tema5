package boletin1.ejercicio4;

public class Television extends Electrodomestico {
	
	private int resolucion = 20;
	boolean sintonizador = false;
	
	public Television(double precio, double peso) {
		super(precio, peso);
	}
	
	public Television(double precio, double peso, String color, char consumoEnergetico, int resolucion, boolean sintonizador) {
		
		super(peso, peso, color, consumoEnergetico);
		
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		
		this.sintonizador = sintonizador;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		double precioBase = getPrecioBase();
		
		if (resolucion > 40) {
			setPrecioBase(precioBase + precioBase * 30 / 100); 
		}
		
		if (sintonizador) {
			setPrecioBase(precioBase + 50);
		}
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "RESOLUCIÓN -> " + this.resolucion + "\n" + 
		"SINTONIZADOR -> " + this.sintonizador;
	}
}
