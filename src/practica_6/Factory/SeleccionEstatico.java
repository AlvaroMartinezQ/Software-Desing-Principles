package practica_6.Factory;

public class SeleccionEstatico extends Ordenacion {

	int[] v;

	public SeleccionEstatico(int[] v) {
		this.v = v;
	}

	public void ordena() {
		int m;
		for (int i = 0; i < v.length - 1; i++) {
			m = i;
			for (int j = i + 1; j < v.length; j++)
				if (v[j] > v[m])
					m = j;
			int aux = v[i];
			v[i] = v[m];
			v[m] = aux;
		}
	}

	public void imprime() {
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i]);
		System.out.println();
	}
}
