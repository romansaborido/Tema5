package boletin4.ejercicio5;

public class Titular implements Comparable<Titular> {

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


	@Override
	public int compareTo(Titular otroTitular) {

		int res = 0;
		
		// Obtenemos la parte numerica del dni
		int thisParteNumerica = Integer.parseInt(this.dni.substring(0, 8));
		
		// Obtenemos la parte numerica del otro titular
		int parteNumericaOtroTitular = Integer.parseInt(otroTitular.dni.substring(0, 8));
		
		if (thisParteNumerica < parteNumericaOtroTitular) {
			res = -1;
		} else if (thisParteNumerica > parteNumericaOtroTitular) {
			res = 1;
		}
		
		return res;
	}
	
	
	
}
