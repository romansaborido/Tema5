package boletin2.ejercicio2;

public class Futbolista implements Comparable<Futbolista>{

	private int dorsal;
	private String nombre;
	private int edad;
	private int goles;
	
	
	public Futbolista(String nombre, int dorsal) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (dorsal > 0) {
			this.dorsal = dorsal;
		}
	}
	
	public Futbolista(String nombre, int dorsal, int edad, int goles) {
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (dorsal > 0) {
			this.dorsal = dorsal;
		}
		
		if (edad > 15) {
			this.edad = edad;
		}
		
		if (goles >= 0) {
			this.goles = goles;
		}
	}
	
	
	@Override
	public String toString() {
		return this.nombre + " (" + this.edad + ")" + "\n" +
		"DORSAL -> " + this.dorsal + "\n" + 
		"GOLES -> " + this.goles;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if (obj instanceof Futbolista f) {
			if (this.nombre.equalsIgnoreCase(f.nombre) && this.dorsal == f.dorsal) {
				res = true;
			}
		}
		
		return res;
	}
	
	@Override
	public int compareTo(Futbolista f) {
		int res = 0;
		
		if (this.dorsal > f.dorsal) {
			res = 1;
		} else if (this.dorsal < f.dorsal) {
			res = -1;
		} else if (this.dorsal == f.dorsal) {
			res = this.nombre.compareTo(f.nombre);
		}
		
		return res;
	}
	
	
	
	
	
	
}
