package boletin1.ejercicio2;

public class Empleado {

	private String nombre;
	
	
	public Empleado(String nombre) {
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean setNombre(String nombre) {
		
		boolean res = false;
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		return res;
	}
	
	
	@Override
	public String toString() {
		return "Empleado " + this.nombre;
	}
}
