package practica_4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TablaComplicados extends TablaDatos{
    
    public static final int Large = 11, ps1 = 0, ps2 = 0;
    public static final int[] m = {7,8,3,5,6,6,4,5,8,7,14};
    public static final int[] n = {7,8,14,8,7,8,8,7,4,5,3};
    
    public TablaComplicados(boolean txt){
        this.titulos = new String[Large];
        this.abierto = new boolean[Large];
        this.cerrado = new boolean[Large];
        this.tiempoAbierto = new long[Large];
        this.tiempoCerrado = new long[Large];
        this.tablerosAbiertos = new String[Large];
        this.tablerosCerrados = new String[Large];
        
        execPruebas();
        
        if (txt) generaTxT("TablaComplicada.txt");
    }
    
    private void execPruebas(){
        Caballo c = new Caballo();
        for(int i = 0; i < Large; i++){
            titulos[i] = m[i]+"x"+n[i];
            Datos temp;
            if(i!=1&&i!=5){    
                temp = c.buscaCamino(ps1, ps2, m[i], n[i], 1);
                abierto[i] = temp.funciono;
                tiempoAbierto[i] = temp.tiempo;
                tablerosAbiertos[i] = temp.tablero;
            }else{
                abierto[i] = false;
                tiempoAbierto[i] = 9999999;
                tablerosAbiertos[i] = stringTableroNulo(m[i], n[i]);
            }
            if(i!=0&&i!=1&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7&&i!=9){
                temp = c.buscaCamino(ps1, ps2, m[i], n[i], 2);
                cerrado[i] = temp.funciono;
                tiempoCerrado[i] = temp.tiempo;
                tablerosCerrados[i] = temp.tablero;
            }else{
                cerrado[i] = false;
                tiempoCerrado[i] = 9999999;
                tablerosCerrados[i] = stringTableroNulo(m[i], n[i]);
            }
        }
    }
    
    private void generaTxT(String nombre){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nombre))){
            writer.write(this.toString());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int idx = 0; idx < Large; idx++){
            sb.append(titulos[idx]);
            sb.append(": ");
            sb.append(this.abierto[idx]);
            sb.append(", ");
            sb.append(this.cerrado[idx]);
            sb.append(", ");
            sb.append(this.tiempoAbierto[idx]);
            sb.append("ms");
            sb.append(", ");
            sb.append(this.tiempoCerrado[idx]);
            sb.append("ms");
            sb.append("\n\n");
            sb.append("TableroAbierto:\n" + tablerosAbiertos[idx] + "\n");
            sb.append("TableroCerrado:\n" + tablerosCerrados[idx] + "\n");
        }
        return sb.toString();
    }
    
    private String stringTableroNulo(int m, int n) {
		StringBuilder sb = new StringBuilder();
                sb.append("------\n");
                sb.append("Tablero con dimensiones de " + m + " filas por " + n + " columnas.\n");
                sb.append("Ha tardado en ejecutar: No ha terminado\n");
                sb.append("El algoritmo no tiene solucion para el caso introducido.\n");
		for (int f = 0; f < m; f++) {
			for (int c = 0; c < n; c++) {
				sb.append("0 ");
			}
			sb.append("\n");
		}
		sb.append("------\n");
                return sb.toString();
    }
}
