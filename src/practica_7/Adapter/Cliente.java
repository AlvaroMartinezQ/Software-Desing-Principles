package practica_7.Adapter;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
	public static void main(String[] args) {

		SeleccionDirecta sD = new SeleccionDirecta();
		AdapterSeleccionDirecta adSD = new AdapterSeleccionDirecta(sD);
		MergeSort mS = new MergeSort();

		int[] v = inicializarVector();

		ArrayList<Integer> al = inicializarArrayList(v);

		System.out.println("Se crea un vector con estos datos");
		imprimirArray(v);
		System.out.println();
		System.out.println();

		System.out.println("Se crea un array list");
		imprimirArrayList(al);
		System.out.println();
		System.out.println();

		System.out.println("Se ordena el vector con seleccion directa");
		sD.ordena(v);
		imprimirArray(v);
		System.out.println();
		System.out.println();

		System.out.println("Se ordena el vector con mergesort");
		mS.ordena(al);
		imprimirArrayList(al);
		System.out.println();
		System.out.println();

		System.out.println("Se recrean los vectores para volver a desordenarlos");
		System.out.println();
		v = inicializarVector();
		al = inicializarArrayList(v);

		System.out.println("Se muestra el nuevo vector");
		imprimirArray(v);
		System.out.println();
		System.out.println();

		System.out.println("Se muestra el array list para ver los nuevos valores tambien");
		imprimirArrayList(al);
		System.out.println();
		System.out.println();

		System.out.println("Se ordena el ArrayList mediante selección directa usando el adaptador:");
		adSD.ordena(al);
		imprimirArrayList(al);
		System.out.println();
	}

	private static int[] inicializarVector() {

		int[] v = { 2, 3, 144, 321, 8, 2300, 6, 5, 10, 456, 988, 444 };

		return v;
	}

	private static ArrayList inicializarArrayList(int[] v) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < v.length; i++) {
			al.add(v[i]);
		}

		return al;
	}

	private static void imprimirArray(int[] v) {

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}

	private static void imprimirArrayList(ArrayList l) {

		Iterator it = l.iterator();

		while (it.hasNext()) {
			System.out.print((int) it.next() + " ");
		}
	}
}
