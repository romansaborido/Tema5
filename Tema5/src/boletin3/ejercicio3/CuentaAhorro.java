package boletin3.ejercicio3;

public class CuentaAhorro extends CuentaBancaria {
	
	private double cuotaMantenimiento;
	
	private double interesAnual;
	
	
	public CuentaAhorro(Titular t, String numeroCuenta, double cuotaMantenimiento, double interesAnual) {
		
		super(t, numeroCuenta);
		
		if (cuotaMantenimiento > 0) {
			this.cuotaMantenimiento = cuotaMantenimiento;
		}
		
		if (interesAnual > 0) {
			this.interesAnual = interesAnual;
		}
	}
	
	
	public double getCuotaMantenimiento() {
		return this.cuotaMantenimiento;
	}
	
	public double getInteresAnual() {
		return this.interesAnual;
	}
	
	
	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		if (cuotaMantenimiento > 0) {
			this.cuotaMantenimiento = cuotaMantenimiento;
		}
	}
	
	public void setInteresAnual(double cuotaInteresAnual) {
		if (cuotaInteresAnual > 0) {
			this.interesAnual = cuotaInteresAnual;
		}
	}
	
	
	public double aplicarMantenimiento() {
		double saldo = this.getSaldo();
		return saldo - saldo * this.cuotaMantenimiento / 100;
	}
	
	public double aplicarInteres() {
		double saldo = this.getSaldo();
		return saldo - saldo * this.interesAnual / 100;
	}
	
	
}
