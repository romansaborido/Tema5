package boletin2.ejercicio3;

public abstract class AnimalDomestico implements Animal {
	
	private String nombre;
	private String raza;
	private int peso;
	private String color;
	
	public AnimalDomestico(String nombre, String raza, int peso, String color) {
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (raza != null && !raza.isBlank()) {
			this.raza = raza;
		}
		
		if (peso > 0) {
			this.peso = peso;
		}
		
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getRaza() {
		return this.raza;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	public void vacunar() {
		System.out.println("Tu mascota ha sido vacunada");
	}
	
	public abstract boolean hacerCaso();
	
	@Override
	public void comer() {
		System.out.println("Ñam, ñam, ñam");
	}

	@Override
	public void dormir() {
		System.out.println("Zzz, Zzz, Zzz");
	}

	@Override
	public abstract void hacerRuido();

}
