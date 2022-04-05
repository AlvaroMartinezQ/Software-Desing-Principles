package practica_6.Factory;

public class FactoryEstatica extends Factory {

	int[] v;

	public FactoryEstatica(int[] v) {
		this.v = v;
	}

	public Ordenacion createOrden(String item) {
		if (item.equals("burbuja")) {
			return new BurbujaEstatico(v);
		} else if (item.equals("seleccion")) {
			return new SeleccionEstatico(v);
		} else
			return null;
	}
}
