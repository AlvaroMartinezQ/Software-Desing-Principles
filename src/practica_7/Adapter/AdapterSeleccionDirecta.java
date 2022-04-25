package practica_7.Adapter;

import java.util.*;

public class AdapterSeleccionDirecta implements Objetivo {

	private SeleccionDirecta selDir;

	public AdapterSeleccionDirecta(SeleccionDirecta selDir) {
		this.selDir = selDir;
	}

	@Override
	public void ordena(ArrayList<Integer> a) {

		int[] v = new int[a.size()];

		// Copiamos todos los elementos a una array:
		Iterator it = a.iterator();
		int i = 0;
		while (it.hasNext()) {
			v[i] = (int) it.next();
			i++;
		}

		// Ordenamos el array:
		selDir.ordena(v);

		// Se vacia y se rellena el arrayList ya ordenado:
		a.clear();
		for (i = 0; i < v.length; i++) {
			a.add(v[i]);
		}
	}
}
