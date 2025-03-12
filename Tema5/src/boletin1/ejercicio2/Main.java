package boletin1.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		// Creamos los siguientes objetos
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		
		// Comprobamos si hemos hecho el ejercicio correctamente
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
	}

}
