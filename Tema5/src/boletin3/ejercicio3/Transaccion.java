package boletin3.ejercicio3;

public class Transaccion {

	private int dia;
	
	private int mes;
	
	private int año;
	
	private String concepto;
	
	private double importe;
	
	
	public Transaccion(int dia, int mes, int año, String concepto, double importe) {
		
		if (dia >= 0 && dia <= 31) {
			this.dia = dia;
		}
		
		if (mes >= 0 && mes <= 12) {
			this.mes = mes;
		}
		
		if (año >= 0 && año <= 12) {
			this.año = año;
		}
		
		if (concepto != null && !concepto.isBlank()) {
			this.concepto = concepto;
		}
		
		if (importe > 0) {
			this.importe = importe;
		}
	}
	
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAño() {
		return this.año;
	}
	
	public String getConcepto() {
		return this.concepto;
	}
	
	public double getImporte() {
		return this.importe;
	}
	
	
}
