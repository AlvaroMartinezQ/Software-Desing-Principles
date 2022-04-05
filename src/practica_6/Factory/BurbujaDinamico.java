package practica_6.Factory;

import java.util.ArrayList;

public class BurbujaDinamico extends Ordenacion {

	ArrayList<Integer> a;

	public BurbujaDinamico(ArrayList<Integer> a) {
		this.a = a;
	}

	public void ordena() {
		for (int i = 0; i < a.size() - 1; i++)
			for (int j = a.size() - 1; j > i; j--)
				if (a.get(j - 1) > a.get(j)) {
					Integer aux = a.get(j - 1);
					a.set(j - 1, a.get(j));
					a.set(j, aux);
				}
	}

	public void imprime() {
		for (int i = 0; i < a.size(); i++)
			System.out.print(a.get(i));
		System.out.println();
	}
}
