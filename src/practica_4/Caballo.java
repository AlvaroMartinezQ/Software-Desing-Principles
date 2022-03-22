package practica_4;

import java.util.Scanner;

public class Caballo implements Recorrido {

	private final int MOVS = 8;
	private int filas = 0;
	private int columnas = 0;

	// Setup
	public Datos buscaCamino(int pos1, int pos2, int filas, int columnas, int tipo) {
		boolean exito = false;
		int[][] tablero = new int[filas + 1][columnas + 1];
		for (int x = 1; x <= filas; x++) {
			for (int y = 1; y <= columnas; y++) {
				tablero[x][y] = -1;
			}
		}

		// Orden de movimientos
		int movimientoFilasV1[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
		int movimientoColumnasV1[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
		int movimientoFilasV2[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int movimientoColumnasV2[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
		if (0 == pos1 || 0 == pos2 || pos1 > tablero.length || pos2 > tablero[0].length) {
			System.out.println("Fallo en las posiciones iniciales, se excede el limite del tablero.");
			return new Datos(exito, 0);
		}

		tablero[pos1][pos2] = 0; // Casilla ya visitada (la inicial, 0)
		long t_comienzo = System.nanoTime();
		switch (tipo) {
		case 1:
			exito = buscarCaminoAbierto(pos1, pos2, 1, tablero, movimientoFilasV2, movimientoColumnasV2);
			break;
		case 2:
			exito = buscarCaminoCerrado(pos1, pos2, 0, tablero, movimientoFilasV1, movimientoColumnasV1);
			break;
		default:
			System.out.println("Tipo de recorrido erroneo.");
			return new Datos(exito, 0);
		}

		long t_fin = System.nanoTime();
		imprimeTablero(tablero, exito, (t_fin - t_comienzo));

		return new Datos(exito, (t_fin - t_comienzo));
	}

	// ----------------------
	// Metodos backtracking

	private boolean buscarCaminoAbierto(int pos1, int pos2, int movimiento, int[][] tablero, int[] movX, int[] movY) {
		if (movimiento == this.filas * this.columnas) {
			return true;
		}

		for (int i = 0; i < this.MOVS; i++) {
			int proximaFila = pos1 + movX[i];
			int proximaColumna = pos2 + movY[i];

			if (esSegura(proximaFila, proximaColumna, tablero)) {
				tablero[proximaFila][proximaColumna] = movimiento;
				if (buscarCaminoAbierto(proximaFila, proximaColumna, movimiento + 1, tablero, movX, movY)) {
					return true;
				} else {
					tablero[proximaFila][proximaColumna] = -1;
				}
			}
		}
		return false;
	}

	public boolean buscarCaminoCerrado(int pos1, int pos2, int movimiento, int[][] tablero, int[] movX, int[] movY) {
		if (movimiento == this.filas * this.columnas) {
			return true;
		}

		for (int j = 0; j < this.MOVS; j++) {
			int proximaFila = pos1 + movX[j];
			int proximaColumna = pos2 + movY[j];
			if (rango(proximaFila, proximaColumna, movimiento+1, tablero)) {
				if (buscarCaminoCerrado(proximaFila, proximaColumna, movimiento + 1, tablero, movX, movY)) {
					tablero[pos1][pos2] = movimiento+1;
					return true;
				}
			}
		}
		tablero[pos1][pos2] = -1;
		return false;
	}

	// ----------------------
	// Utilidades de la clase

	private boolean esSegura(int f, int c, int[][] array) {
		if (f >= 1 && f <= this.filas && c >= 1 && c <= this.columnas) {
			if (array[f][c] == -1) {
				return true;
			}
		}
		return false;
	}

	private boolean rango(int a, int b, int i, int[][] tablero) {
		if ((a >= 0 && a < tablero.length) && (b >= 0 && b < tablero[0].length)) {
			if (i < tablero.length * tablero[0].length) {
				return tablero[a][b] == -1;
			} else {
				return tablero[a][b] == 1;
			}
		}
		return false;
	}

	private void imprimeTablero(int[][] tablero, boolean esSolucion, long tiempo) {
		System.out.println("------");
		System.out.println("Tablero con dimensiones de " + this.filas + " filas por " + this.columnas + " columnas.");
		System.out.println("Ha tardado en ejecutar: " + tiempo / 1000000 + " ms.");
		if (esSolucion) {
			System.out.println("El algoritmo tiene solucion para el caso introducido.");
		} else {
			System.out.println("El algoritmo no tiene solucion para el caso introducido.");
		}
		for (int f = 1; f < tablero.length; f++) {
			for (int c = 1; c < tablero[0].length; c++) {
				if (esSolucion) {
					System.out.print(tablero[f][c] + "\t");
				} else {
					System.out.print("0\t");
				}
			}
			System.out.println();
		}
		System.out.println("------");
	}

	// ----------------------
	// Metodos de la interfaz

	@Override
	public boolean execUsuario() {
		System.out.println("## Ejecutando metodo exec de usuario ##");
		Scanner in = new Scanner(System.in);
		// Pide filas
		System.out.println("Filas del problema: ");
		int filas = in.nextInt();
		// Pide columnas
		System.out.println("Columnas del problema: ");
		int columnas = in.nextInt();
		// Pide fila donde empezara el caballo
		System.out.println("Fila donde empezara el caballo (empezando en 1): ");
		int pos1 = in.nextInt();
		// Pide columna donde empezara el caballo
		System.out.println("Columna donde empezara el caballo (empezando en 1): ");
		int pos2 = in.nextInt();
		// Pide columna donde empezara el caballo
		System.out.println("Tipo de camino, 1 abierto, 2 cerrado: ");
		int tipo = in.nextInt();
		in.close();
		this.filas = filas;
		this.columnas = columnas;
		return buscaCamino(pos1, pos2, filas, columnas, tipo).funciono;
	}

	@Override
	public void execPruebas() {
		System.out.println("## Ejecutando metodo exec de pruebas ##");
		Scanner in = new Scanner(System.in);
		int tipo;
		do {
			System.out.println("Tipo de pruebas, 1 basicas, 2 complicadas: ");
			tipo = in.nextInt();
		} while (tipo != 1 && tipo != 2);

		switch (tipo) {
		case 1:
			TablaBasica tb = new TablaBasica();
			System.out.println(tb.toString());
			break;
		case 2:
			TablaComplicados tc = new TablaComplicados();
			System.out.println(tc.toString());
			break;
		}
		in.close();
	}

}
