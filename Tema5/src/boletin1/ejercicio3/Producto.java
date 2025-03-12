package boletin1.ejercicio3;

public class Producto {

	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public boolean setPrecio(double precio) {
		
		boolean res = false;
		
		if (precio > 0) {
			this.precio = precio;
			res = true;
		}
		
		return res;
	}
	
	public double calcular(int cantidad) {
		return this.precio * cantidad;
	}
	
	@Override
	public String toString() {
		return this.nombre + "\n" + "------------" + 
		"PRECIO -> " + this.precio;
	}
}
