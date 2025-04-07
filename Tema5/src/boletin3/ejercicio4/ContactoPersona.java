package boletin3.ejercicio4;

public class ContactoPersona extends Contacto {

	private String fechaNacimiento;
	
	
	public ContactoPersona(String nombre, int telefono, String fechaNacimiento) {
		super(nombre, telefono);
		
		if (fechaNacimiento != null && !fechaNacimiento.isBlank() && fechaNacimiento.length() == 10) {
			this.fechaNacimiento = fechaNacimiento;
		}
	}
	
	
	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
}
