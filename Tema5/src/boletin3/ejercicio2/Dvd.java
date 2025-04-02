package boletin3.ejercicio2;

public class Dvd extends Ficha {

	enum Tipo { 
		PELICULA, DOCUMENTAL, SERIE 
	}
	
	private String director;
	
	private String año;
	
	private Tipo tipo = Tipo.PELICULA;
	
	
	public Dvd(int id, String titulo, String director, String año, String tipo) {
		super(id, titulo);
		
		if (director != null && !director.isBlank()) {
			this.director = director;
		}
		
		if (año != null && !año.isBlank()) {
			this.año = año;
		}
		
		switch (tipo) { 
			case "PELICULA", "DOCUMENTAL", "SERIE" -> { this.tipo = Tipo.valueOf(tipo); }
		}
	}

	
	public String getDirector() {
		return this.director;
	}
	
	public String getAño() {
		return this.año;
	}
	
	public String getTipo() {
		return String.valueOf(this.tipo);
	}

	
	@Override
	public String prestar() {
		return this.getTitulo() + " " + this.director + "\n" + 
		"---------------" + "\n" +
		"DVD prestado por 5 días" + "\n";
	}
}
