package boletin3.ejercicio3;

import java.util.List;

public class CuentaCorriente extends CuentaBancaria {

	private double porcentaje;
	
	private List<Transaccion> transacciones;
	
	
	public CuentaCorriente(Titular t, String numeroCuenta, double porcentaje) {
		super(t, numeroCuenta);
		
		if (porcentaje > 0) {
			this.porcentaje = porcentaje;
		}
	}
	
	
	public double getPorcentaje() {
		return this.porcentaje;
	}
	
	public void setPorcentaje(double porcentaje) {
		if (porcentaje > 0) {
			this.porcentaje = porcentaje;
		}
	}
	
	
	public boolean realizarTransaccion(Transaccion t) {
		return transacciones.add(t);
	}
}
