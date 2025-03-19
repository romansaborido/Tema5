package boletin2.ejercicio1;

public class Socio implements Comparable<Socio> {

	private int id;
	private String nombre;
	private int edad;
	
	
	public Socio(int id, String nombre, int edad) {
		
		if (id > 0) {
			this.id = id;
		}
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (edad > 0) {
			this.edad = edad;
		}
	}
	
	
	@Override
	public int compareTo(Socio socio) {
		int res = 0;
		
		if (this.id > socio.id) {
			res = 1;
		} else if (this.id < socio.id) {
			res = -1;
		}
		
		return res;
	}
	
	
	@Override
	public String toString() {
		return 
		"ID -> " + this.id + "\n" +
		"NOMBRE -> " + this.nombre + "\n" +
		"EDAD -> " + this.edad;	
	}
}
