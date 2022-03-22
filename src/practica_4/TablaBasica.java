package trabajofds4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TablaBasica extends TablaDatos{
    
    public static final int Large = 20, ps1 = 0, ps2 = 0;
    public static final int[] m = {3,4,5,6,3,3,5,3,3,3,3,4,4,5,6,8,6,6,10,12};
    public static final int[] n = {3,4,5,6,10,12,6,4,5,6,8,6,3,3,3,3,4,5,3,3};
    
    public TablaBasica(){
        this.titulos = new String[Large];
        this.abierto = new boolean[Large];
        this.cerrado = new boolean[Large];
        this.tiempoAbierto = new long[Large];
        this.tiempoCerrado = new long[Large];
        
        execPruebas();
        
        generaTxT("TablaBasica.txt");
    }
    
    private void execPruebas(){
        Caballo c = new Caballo();
        for(int i = 0; i < Large; i++){
            titulos[i] = m[i]+"x"+n[i];
            Datos temp = c.buscaCamino(ps1, ps2, m[i], n[i], 1);
            abierto[i] = temp.funciono;
            tiempoAbierto[i] = temp.tiempo;
            temp = c.buscaCamino(ps1, ps2, m[i], n[i], 2);
            cerrado[i] = temp.funciono;
            tiempoCerrado[i] = temp.tiempo;
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
            sb.append(", ");
            sb.append("\n");
        }
        return sb.toString();
    }
}
