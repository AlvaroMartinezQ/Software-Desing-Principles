package practica_4;

import java.util.Scanner;

public class Caballo implements Recorrido {  
	
	// ----------------------
	// Inicio de backtracking
	// Setup previo
	
	public boolean buscaCamino(int pos1, int pos2, int filas, int columnas) {
		boolean exito = false;
		int[][] tablero = new int[filas][columnas];
		for(int x = 0; x < filas; x++){
            for(int y = 0; y < columnas; y++){
                tablero[x][y] = -1; 
            }
        }
		//Orden de movimientos
		int[] movimientoFilas = {-2, -1, 1, 2, -2, -1, 1, 2};
        int[] movimientoColumnas = {-1, -2, -2, -1, 1, 2, 2, 1};
		if (pos1 >= tablero.length || pos2 >= tablero[0].length) {
			System.out.println("Fallo en las posiciones iniciales, se excede el limite del tablero.");
			return exito;
		}
		
		tablero[pos1][pos2] = 1; // Casilla ya visitada (la inicial, 0)
		long t_comienzo = System.nanoTime();
		exito = buscarCaminoAbierto(pos1, pos2, 1, tablero, movimientoFilas, movimientoColumnas); // Comenzaremos en la posicion 1
		long t_fin = System.nanoTime();
		imprimeTablero(tablero, exito, (t_fin- t_comienzo));
		
		return exito;
	}
	
	// ----------------------
	// Metodo de backtracking
	
	private boolean buscarCaminoAbierto(int pos1, int pos2, int movimiento, int[][] tablero, int[] movX, int[] movY) {
		if(movimiento == tablero.length * tablero[0].length){
            return true;
        }

        int proximaFila, proximaColumna, i;
        int aux = movimiento;
        for(i = 0; i < movX.length; i++){
        	proximaFila = pos1 + movX[i];
        	proximaColumna = pos2 + movY[i];
            if(esSegura(proximaFila, proximaColumna, tablero)){
            	tablero[proximaFila][proximaColumna] = aux+1;
                if(buscarCaminoAbierto(proximaFila, proximaColumna, movimiento + 1, tablero, movX, movY)){
                    return true;
                }else{
                	tablero[proximaFila][proximaColumna] = -1;
                }
            }
        }
        return false;
	}
	
	// ----------------------
	// Utilidades de la clase
	
	private boolean esSegura(int x, int y, int[][] array){
        return(x >= 0 && x < array.length && y >= 0 && y < array[0].length && array[x][y] == -1);
    }
	
	private void imprimeTablero(int[][] tablero, boolean esSolucion, long tiempo) {
		System.out.println("------");
		System.out.println("Tablero con dimensiones de " + tablero.length + " filas por " + tablero[0].length + " columnas.");
		System.out.println("Ha tardado en ejecutar: " + tiempo / 1000000 + " ms.");
		for (int f = 0; f < tablero.length; f++) {
			for (int c = 0; c < tablero[0].length; c++) {
				if (esSolucion) {
					System.out.print(tablero[f][c] + " ");
				} else {
					System.out.print("0 ");
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
		Scanner in = new Scanner(System.in);
		// Pide filas
		System.out.println("Filas del problema: ");  
		int filas = in.nextInt();
		// Pide columnas
		System.out.println("Columnas del problema: ");  
		int columnas = in.nextInt();
		// Pide fila donde empezara el caballo
		System.out.println("Fila donde empezara el caballo: ");  
		int pos1 = in.nextInt();
		// Pide columna donde empezara el caballo
		System.out.println("Columna donde empezara el caballo: ");  
		int pos2 = in.nextInt();
		in.close();
		return buscaCamino(pos1, pos2, filas, columnas);
	}

	@Override
	public void execPruebas() {
		// TODO Auto-generated method stub
		
	}
	
}
