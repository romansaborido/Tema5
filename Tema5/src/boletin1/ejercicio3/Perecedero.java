package boletin1.ejercicio3;

public class Perecedero extends Producto{
	
	private int diasCaducar;
	
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		
		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
		}
	}
	
	public int getDiasCaducar() {
		return this.diasCaducar;
	}
	
	public boolean setDiasCaducar(int diasCaducar) {
		
		boolean res = false;
		
		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
			res = true;
		}
		
		return res;
	}
	
	public double calcular(int cantidad) {
		
		double precio = super.calcular(cantidad);
		
		if (this.diasCaducar == 1) {
			precio = precio / 4;
		} else if (this.diasCaducar == 2) {
			precio = precio / 3;
		} else if (this.diasCaducar == 3) {
			precio = precio / 2;
		}
		
		return precio;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "DIAS A CADUCAR -> " + this.diasCaducar;
	}
}
