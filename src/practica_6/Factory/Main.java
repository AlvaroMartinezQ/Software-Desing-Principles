package practica_6.Factory;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();

		a.add(4);
		a.add(1);
		a.add(7);

		int[] v = { 4, 1, 7 };

		Factory dinamic = new FactoryDinamica(a);
		Factory estatic = new FactoryEstatica(v);

		Ordenacion orden = dinamic.ordena("burbuja");
		orden.imprime();
		orden = dinamic.ordena("seleccion");
		orden.imprime();
		orden = estatic.ordena("burbuja");
		orden.imprime();
		orden = estatic.ordena("seleccion");
		orden.imprime();

		orden = dinamic.createOrden("seleccion");
		orden = dinamic.createOrden("burbuja");
		orden = estatic.createOrden("seleccion");
		orden = estatic.createOrden("burbuja");

		// ----
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();

		a2.add(40);
		a2.add(10);
		a2.add(70);

		int[] v2 = { 40, 10, 70 };

		Factory dinamic2 = new FactoryDinamica(a2);
		Factory estatic2 = new FactoryEstatica(v2);

		Ordenacion orden2 = dinamic2.imprime("burbuja");
		orden2.imprime();
		orden2 = dinamic2.imprime("seleccion");
		orden2.imprime();
		orden2 = estatic2.imprime("burbuja");
		orden2.imprime();
		orden2 = estatic2.imprime("seleccion");
		orden2.imprime();
	}
}
