package practica_6.Factory;

public class BurbujaEstatico extends Ordenacion {

	int[] v;

	public BurbujaEstatico(int[] v) {
		this.v = v;
	}

	public void ordena() {
		for (int i = 0; i < v.length - 1; i++)
			for (int j = v.length - 1; j > i; j--)
				if (v[j - 1] > v[j]) {
					int aux = v[j - 1];
					v[j - 1] = v[j];
					v[j] = aux;
				}

	}

	public void imprime() {
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i]);
		System.out.println();
	}

}
