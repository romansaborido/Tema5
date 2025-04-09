package boletin4.ejercicio4;

public class Ficha implements Comparable<Ficha> {

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
	
	
	@Override
	public int compareTo(Ficha ficha) {
		
		int res = 0;
		
		if (this.id < ficha.id) {
			res = -1;
		} else if (this.id > ficha.id) {
			res = 1;
		}
		
		return res;
	}
	
	public String toString() {
		return "ID -> " + this.id + "\n" +
			   "TÍTULO -> " + this.titulo + "\n";
	}
}
