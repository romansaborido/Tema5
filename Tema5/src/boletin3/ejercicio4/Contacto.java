package boletin3.ejercicio4;

public class Contacto {

	private String nombre;
	
	int telefono;
	
	
	public Contacto(String nombre, int telefono) {
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (String.valueOf(telefono).length() == 9) {
			this.telefono = telefono;
		}
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(int telefono) {
		if (String.valueOf(telefono).length() == 9) {
			this.telefono = telefono;
		}
	}
	
	
	public boolean equals(Object obj) {
		boolean res = false;
		
		Contacto contacto = (Contacto) obj;
		
		if (this.nombre.equalsIgnoreCase(contacto.nombre)) {
			res = true;
		}
		
		return res;
	}
}
