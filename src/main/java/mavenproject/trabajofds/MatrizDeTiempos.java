package mavenproject.trabajofds;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MatrizDeTiempos {
    
    //Atributos:
        private int filas;
        private int columnas;
        private long[][] matrizTiempos;
        private String[] titulos;
    //End Atributos.
    
    //Constructor:
        public MatrizDeTiempos(int filas, int columnas, String[] titulos){
            this.filas = filas;
            this.columnas = columnas;
            this.titulos = titulos;
            this.matrizTiempos = new long[filas][columnas];
        }
    //End Constructor.
    
    //Métodos públicos:
        public void asignaValor(int fila, int columna, long valor){
            matrizTiempos[fila][columna] = valor;
        }
        public void imprimeTiempos(){
            System.out.println(this.toString());
        }
        public void guardaTiempos(String outputFilePath){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))){
                String cabecera = "";
                for(int idx = 0; idx < this.getTitulos().length; idx++){
                    cabecera += this.getTitulos()[idx] + ";";
                }
                cabecera += "\n";
                writer.write(cabecera);
                
                String integerFormat = "%8d;";
                for(int idx = 0; idx < this.getFilas(); idx++){
                    String fila = "";
                    for(int idx2 = 0; idx2 < this.getColumnas(); idx2++){
                        fila += String.format(integerFormat, this.matrizTiempos[idx][idx2]);
                    }
                    fila += "\n";
                    writer.write(fila);
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        @Override
        public String toString(){
            return matrizAString();
        }
    //End Métodos públicos.
    
    //Métodos privados:
        private String matrizAString(){
            StringBuilder sb = new StringBuilder();
            String cabecera = "";
            for(int idx = 0; idx < this.getTitulos().length; idx++)cabecera += this.getTitulos()[idx] + ";";
            cabecera += "\n";
            sb.append(cabecera);
            String integerFormat = "%8d;";
            for(int idx = 0; idx < this.getFilas(); idx++){
                String fila = "";
                for(int idx2 = 0; idx2 < this.getColumnas(); idx2++){
                    fila += String.format(integerFormat, this.matrizTiempos[idx][idx2]);
                }
                fila += "\n";
                sb.append(fila);
            }
            return sb.toString();
        }
    //End Métodos privados.
    
    //Setters:
        public void setFilas(int filas){this.filas = filas;}
        public void setColumnas(int columnas){this.columnas = columnas;}
        public void setMatrizTiempos(long[][] matrizTiempos){this.matrizTiempos = matrizTiempos;}
        public void setTitulos(String[] titulos){this.titulos = titulos;}
    //End Setters.
    
    //Getters:
        public int getFilas(){return this.filas;}
        public int getColumnas(){return this.columnas;}
        public long[][] getMatrizTiempos(){return this.matrizTiempos;}
        public String[] getTitulos(){return this.titulos;}
    //End Getters.
    
}
