package pratica_2;

public class AlgorDyV {

	private int contador; // numero de inversion
	private double tiempo;

	public AlgorDyV() {
		this.contador = 0;
		this.tiempo = 0.0;
	}

	public String exec_dyv(int[] v) {
		long t_inicio = System.nanoTime();

		this.contador = algorDyV(v);

		long t_final = System.nanoTime();

		this.tiempo = t_final - t_inicio;
		return (this.toString());
	}

	private int algorDyV(int[] v) {
		int centro = v.length / 2;
		int contador_izquierda;
		int contador_derecha;
		int contador_union;

		// Lista de menor longitud a 1 no devuelve inversion
		if (v.length <= 1) {
			return 0;
		}

		int[] izquierda = new int[centro];
		int[] derecha = new int[v.length - centro];

		// Copiamos los elementos de cada array en su lado respectivo
		for (int i = 0; i < centro; i++) {
			izquierda[i] = v[i];
		}
		for (int i = 0; i < v.length - centro; i++) {
			derecha[i] = v[centro + i];
		}

		// Contamos recursivamente las inversiones en cada parte
		contador_izquierda = algorDyV(izquierda);
		contador_derecha = algorDyV(derecha);

		int[] resultado = new int[v.length];
		contador_union = inversiones_union(izquierda, derecha, resultado);

		for (int i = 0; i < v.length; i++) {
			v[i] = resultado[i];
		}
		return (contador_izquierda + contador_derecha + contador_union);
	}

	private int inversiones_union(int[] izquierda, int[] derecha, int[] res) {
		int a = 0, b = 0, c = 0;
		int count = 0;
		int i;

		// Buscamos las inversiones que hay entre los dos arrays
		while ((a < izquierda.length) && (b < derecha.length)) {
			if (izquierda[a] <= derecha[b]) {
				res[c] = izquierda[a++];
			} else {
				res[c] = derecha[b++];
				count += izquierda.length - a;
			}
			c++;
		}

		if (a == izquierda.length) {
			for (i = b; i < derecha.length; i++) {
				res[c++] = derecha[i];
			}
		} else {
			for (i = a; i < izquierda.length; i++) {
				res[c++] = izquierda[i];
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return (
				"La inversion de la ejecucion es de: " +
				this.contador +
				", ha tardado en ejecutar: "+
				this.tiempo +
				" ms."
		);
	}

}
