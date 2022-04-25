package practica_7.Adapter;

public class SeleccionDirecta {
	public void ordena(int[] v) {
		int m;
		for (int i = 0; i < v.length - 1; i++) {
			m = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[m]) {

					m = j;
					int aux = v[i];
					v[i] = v[m];
					v[m] = aux;
				}
			}
		}
	}
}
