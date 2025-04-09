package boletin4.ejercicio5;

import java.util.TreeSet;

import boletin3.ejercicio3.Titular;

public class CuentaBancaria implements Comparable<CuentaBancaria> {

	private long numeroCuenta;
	
	private double saldo;
	
	private TreeSet<Titular> titulares = new TreeSet<>();

	
	public CuentaBancaria(Titular t, long numeroCuenta) {
		
		if (t != null) {
			añadirTitular(t);
		}
		
		if (String.valueOf(numeroCuenta).length() == 12) {
			this.numeroCuenta = numeroCuenta;
		}
	}

	
	public long getNumeroCuenta() {
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


	@Override
	public int compareTo(CuentaBancaria otraCuenta) {
		
		int res = 0;
		
		if (this.numeroCuenta < otraCuenta.numeroCuenta) {
			res = -1;
		} else if (this.numeroCuenta > otraCuenta.numeroCuenta) {
			res = 1;
		}
		
		return res;
	}
	
	
	
}
