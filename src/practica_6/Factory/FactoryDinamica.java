package practica_6.Factory;

import java.util.ArrayList;

public class FactoryDinamica extends Factory {

	ArrayList<Integer> a;

	public FactoryDinamica(ArrayList<Integer> a) {
		this.a = a;
	}

	public Ordenacion createOrden(String item) {
		if (item.equals("burbuja")) {
			return new BurbujaDinamico(a);
		} else if (item.equals("seleccion")) {
			return new SeleccionDinamico(a);
		} else
			return null;
	}
}
