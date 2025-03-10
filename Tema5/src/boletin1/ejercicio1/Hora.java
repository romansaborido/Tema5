package boletin1.ejercicio1;

public class Hora {

	private int hora;
	private int minutos;
	
	public Hora(int hora, int minutos) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
	}
	
	public void inc() {
		this.minutos++;
		if (minutos == 60) {
			this.hora++;
			this.minutos = 0;
			if (hora == 24) {
				this.hora = 0;
			}
		}
	}
	
	public boolean setMinutos(int valor) {
		boolean res = false;
		if (valor >= 0 && valor <= 59) {
			this.minutos = valor;
			res = true;
		}
		return res;
	}
	
	public boolean setHora(int valor) {
		boolean res = false;
		if (valor >= 0 && valor <= 23) {
			this.hora = valor;
			res = true;
		}
		return res;
	}
	
	@Override
	public String toString() {
		String hora = "";
		hora += this.hora + ":" + this.minutos;
		return hora;
	}
}
