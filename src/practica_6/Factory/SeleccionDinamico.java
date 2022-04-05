package practica_6.Factory;

import java.util.ArrayList;

public class SeleccionDinamico extends Ordenacion {

	ArrayList<Integer> a;

	public SeleccionDinamico(ArrayList<Integer> a) {
		this.a = a;
	}

	public void ordena() {
		int m;
		for (int i = 0; i < a.size() - 1; i++) {
			m = i;
			for (int j = i + 1; j < a.size(); j++)
				if (a.get(j) > a.get(m))
					m = j;
			Integer aux = a.get(i);
			a.set(i, a.get(m));
			a.set(m, aux);
		}
	}

	public void imprime() {
		for (int i = 0; i < a.size(); i++)
			System.out.print(a.get(i));
		System.out.println();
	}
}
