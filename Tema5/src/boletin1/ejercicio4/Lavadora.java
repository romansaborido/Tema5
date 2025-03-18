package boletin1.ejercicio4;

public class Lavadora extends Electrodomestico {
	
	private int carga = 5;
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}
	
	public Lavadora(double precio, double peso, String color, char consumoEnergetico, int carga) {
		super(precio, peso, color, consumoEnergetico);
		
		if (carga > 0) {
			this.carga = carga;
		}
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if (carga > 30) {
			double precioBase = getPrecioBase();
			precioBase += 50;
			setPrecioBase(precioBase);
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "CARGA -> " + this.carga;
	}
	
	
}
