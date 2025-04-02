package boletin3.ejercicio3;

import java.util.TreeSet;

public class CuentaBancaria {

	private String numeroCuenta;
	
	private double saldo;
	
	private TreeSet<Titular> titulares = new TreeSet<>();

	
	public CuentaBancaria(Titular t, String numeroCuenta) {
		
		if (t != null) {
			añadirTitular(t);
		}
		
		if (numeroCuenta != null && !numeroCuenta.isBlank()) {
			this.numeroCuenta = numeroCuenta;
		}
	}

	
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public TreeSet<Titular> getTitular() {
		return this.titulares;
	}

	
	public boolean ingresar(double cantidad) {
		boolean res = false;
		return res;
	}
	
	public boolean retirar(double cantidad) {
		boolean res = false;
		return res;
	}

	
	public boolean añadirTitular(Titular t) {
		
		boolean res = false;
		
		if (this.titulares.size() < 3) {
			res = this.titulares.add(t);
		} else {
			res = false;
		}
		
		return res;
	}
	
	public boolean eliminarTitular(Titular t) {
		boolean res = false;
		
		if (this.titulares.size() > 1) {
			res = this.titulares.remove(t);
		} else {
			res = false;
		}
		
		return res;
	}
}
