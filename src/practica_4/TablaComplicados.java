package trabajofds4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class TablaComplicados extends TablaDatos{
    
    private static final int Large = 11;
    private static final int[] m = {7,8,3,5,6,6,4,5,8,7,14};
    private static final int[] n = {7,8,14,8,7,8,8,7,4,5,3};
    
    public TablaComplicados(int pos1, int pos2, int x){
        this.titulos = new String[Large];
        this.abierto = new boolean[Large];
        this.cerrado = new boolean[Large];
        this.tiempoAbierto = new long[Large];
        this.tiempoCerrado = new long[Large];
        execPruebas(pos1, pos2, x);
        generaTxT("TablaBasica.txt");
    }
    
    private void execPruebas(int pos1, int pos2, int x){
        Caballo c = new Caballo();
        int ps1 = pos1;
        int ps2 = pos2;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < Large; i++){
            if(x == 2){
                do{
                    System.out.println("Introduce la pos1, entre 0 y " + m[i]);
                    ps1 = sc.nextInt();
                }while(ps1 < 0 || ps1 > m[i]);
                do{
                    System.out.println("Introduce la pos2, entre 0 y " + n[i]);
                    ps2 = sc.nextInt();
                }while(ps2 < 0 || ps2 > n[i]);
            }
            titulos[i] = m[i]+"x"+n[i];
            Datos temp = c.buscaCamino(pos1, pos2, m[i], n[i], 1);
            abierto[i] = temp.funciono;
            tiempoAbierto[i] = temp.tiempo;
            temp = c.buscaCamino(pos1, pos2, m[i], n[i], 2);
            cerrado[i] = temp.funciono;
            tiempoCerrado[i] = temp.tiempo;
        }
        sc.close();
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
            sb.append(", ");
            sb.append("\n");
        }
        return sb.toString();
    }
}
