package boletin4.ejercicio5;

import java.util.Comparator;

public class BySaldoDesc implements Comparator<CuentaBancaria> {

	@Override
	public int compare(CuentaBancaria c1, CuentaBancaria c2) {
		return (int) (c2.getSaldo() - c1.getSaldo());
	}

}
