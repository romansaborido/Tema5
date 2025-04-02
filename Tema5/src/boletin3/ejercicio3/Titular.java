package boletin3.ejercicio3;

public class Titular {

	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private int telefono;
	
	
	public Titular(String dni, String nombre, String apellidos, int telefono) {
		
		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		
		if (String.valueOf(telefono).length() == 9) {
			this.telefono = telefono;
		}
	}
	
	
	public String getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(int telefono) {
		if (String.valueOf(telefono).length() == 9) {
			this.telefono = telefono;
		}
	}
	
	
	
}
