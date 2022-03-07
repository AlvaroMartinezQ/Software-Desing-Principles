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
		int inversiones_izquierda, inversiones_derecha, inversiones_union;

		// Lista de menor longitud a 1 no devuelve inversion
		// Ya que no tiene con que dividir y comparar
		if (v.length <= 1) {
			return 0;
		}
		// Preparamos los arrays
		int mid = v.length / 2;
		int[] izquierda = new int[mid];
		int[] derecha = new int[v.length - mid];
		// Copiamos los elementos de cada array en su lado respectivo
		for (int i = 0; i < mid; i++) {
			izquierda[i] = v[i];
		}
		for (int i = 0; i < v.length - mid; i++) {
			derecha[i] = v[mid + i];
		}

		// Contamos recursivamente las inversiones en cada parte
		inversiones_izquierda = algorDyV(izquierda);
		inversiones_derecha = algorDyV(derecha);

		int[] array_resultado = new int[v.length];
		inversiones_union = inversiones_union(izquierda, derecha, array_resultado);

		for (int i = 0; i < v.length; i++) {
			v[i] = array_resultado[i];
		}
		return (inversiones_izquierda + inversiones_derecha + inversiones_union);
	}

	private int inversiones_union(int[] izquierda, int[] derecha, int[] array_resultado) {
		int a = 0, b = 0, c = 0, suma = 0;

		// Buscamos las inversiones que hay entre los dos arrays
		while ((izquierda.length > a) && (derecha.length > b)) {
			// c sera la posicion donde insertaremos
			if (izquierda[a] <= derecha[b]) {
				// No produce inversiones, no sumamos y
				// metemos el valor en el array resultado
				array_resultado[c] = izquierda[a];
				a++;
			} else {
				// Porduce inversiones, metemos en el array
				// resultado el valor y sumamos inversiones
				array_resultado[c] = derecha[b];
				suma += izquierda.length - a;
				b++;
			}
			c++;
		}

		int i;
		// Rellenamos con valores restantes usando la variable
		// c la cual en este momento se encuentra en el ultimo
		// valor + 1 que hemos introducido previamente
		if (a == izquierda.length) {
			// Si he insertado todos los valores de la izquierda
			// inserto los restantes a la derecha
			for (i = b; i < derecha.length; i++) {
				array_resultado[c] = derecha[i];
				c++;
			}
		} else {
			// Si he insertado todos los valores de la derecha
			// inserto los restantes a la izquierda
			for (i = a; i < izquierda.length; i++) {
				array_resultado[c] = izquierda[i];
				c++;
			}
		}
		
		// Devolvemos el resultado de las inversiones
		return suma;
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
