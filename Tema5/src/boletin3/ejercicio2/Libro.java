package boletin3.ejercicio2;

public class Libro extends Ficha {

	private String autor;
	
	private String editorial;
	
	
	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);
		
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		
		if (editorial != null && !editorial.isBlank()) {
			this.editorial = editorial;
		}
	}
	
	
	public String getAutor() {
		return this.autor;
	}
	
	public String getEditorial() {
		return this.editorial;
	}
	
	public void setEditorial(String editorial) {
		if (editorial != null && !editorial.isBlank()) {
			this.editorial = editorial;
		}
	}
	
	
	@Override
	public String prestar() {
		return this.autor + " " + this.editorial + "\n" + 
		"---------------" + "\n" +
		"Libro prestado por 15 días" + "\n";
	}

}
