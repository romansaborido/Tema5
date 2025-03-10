package boletin1.ejercicio1;

public class HoraExacta extends Hora {

	private int segundos;
	
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}
	
	public boolean setSegundo(int valor) {
		boolean res = false;
		if (valor >= 0 && valor <= 59) {
			this.segundos = valor;
			res = true;
		}
		return res;
	}
	
	@Override
	public void inc() {
		this.segundos++;
		if (segundos == 60) {
			this.segundos = 0;
			super.inc();
		}
	}
	
	@Override
	public String toString() {
		String horaExacta = super.toString();
		horaExacta += ":" + this.segundos;
		return horaExacta;
	}
	

}
