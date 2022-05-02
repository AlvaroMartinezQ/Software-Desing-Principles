package practica_8.State;

public class Main {
	public static void main(String[] argv) {
		Vehiculo coche = new Vehiculo();
		// Intentamos realizar acciones sin combustible
		coche.acelerar();
		coche.frenar();
		coche.contacto();
		// Repostamos
		coche.repostar();
		// Arrancamos
		coche.contacto();
		// Aceleramos hasta gastar el combustible
		coche.acelerar();
		coche.acelerar();
		coche.acelerar();
		coche.acelerar();
		coche.acelerar();
		coche.acelerar();
		// Intentamos acelerar una vez mas
		coche.acelerar();
		// Ya no tenemos combustible!

		coche.repostar();

		coche.contacto();

		coche.acelerar();
		coche.acelerar();

		coche.frenar();
		coche.acelerar();

		coche.frenar();
		coche.frenar();

		coche.contacto();
	}
}
