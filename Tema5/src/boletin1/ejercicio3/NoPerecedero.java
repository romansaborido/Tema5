package boletin1.ejercicio3;

public class NoPerecedero extends Producto{
	
	private String tipo;
	
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "TIPO -> " + this.tipo;
	}
}

