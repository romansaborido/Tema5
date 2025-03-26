package boletin3.ejercicio1;

public class Camion extends Vehiculo {

	private int pesoMaximoAutorizado;
	private boolean mercanciaPeligrosa;
	
	public Camion(String marca, String modelo, String color, String matricula, int pesoMaximoAutorizado, boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		
		if (pesoMaximoAutorizado > 1000) {
			this.pesoMaximoAutorizado = pesoMaximoAutorizado;
		}
		
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

}
