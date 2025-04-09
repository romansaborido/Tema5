package boletin3.ejercicio4;

public class ContactoEmpresa extends Contacto {

	private String dominio;
	
	
	public ContactoEmpresa(String nombre, int telefono, String dominio) {
		super(nombre, telefono);
		
		if (dominio != null && !dominio.isBlank()) {
			this.dominio = dominio;
		}
	}
	
	
	public String getDominio() {
		return this.dominio;
	}
	
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
}
