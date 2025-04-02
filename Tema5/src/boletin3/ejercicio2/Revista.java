package boletin3.ejercicio2;

public class Revista extends Ficha {

	private int numeroRevista;
	
	private String añoPublicacion;

	
	public Revista (int id, String titulo, int numeroRevista, String añoPublicacion) {
		super(id, titulo);
		
		if (numeroRevista > 0) {
			this.numeroRevista = numeroRevista;
		}
		
		if (añoPublicacion != null && !añoPublicacion.isBlank()) {
			this.añoPublicacion = añoPublicacion;
		}
	}

	
	public int getNumeroRevista() {
		return this.numeroRevista;
	}
	
	public String getAñoPublicacion() {
		return this.añoPublicacion;
	}

	
	@Override
	public String prestar() {
		return this.numeroRevista + " " + this.añoPublicacion + "\n" + 
		"---------------" + "\n" +
		"Revista prestada por 10 días" + "\n";
	}
}
