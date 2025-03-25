package boletin3.ejercicio1;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	
	private boolean OnOff = false;
	private int marcha = 0;
	private int velocidadActual = 0;

	
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}
	
	private void parar() {
		this.OnOff = false;
	}

	private void arrancar() {
		this.OnOff = true;
	}

	public boolean subirMarcha() {
		boolean res = false;
		if (this.marcha >= 1 && this.marcha <= 4) {
			this.marcha++;
			res = true;
		}
		return res;
	}

	//public boolean bajarMarcha() {
		//boolean res = false;
		//if (this.marcha)
	//}
	
}
