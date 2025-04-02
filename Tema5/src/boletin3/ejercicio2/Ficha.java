package boletin3.ejercicio2;

public abstract class Ficha {

	private int id;
	
	private String titulo;
	
	
	public Ficha(int id, String titulo) {
		
		if (id > 0) {
			this.id = id;
		}
		
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}
	
	
	public abstract String prestar();
}
