package practica_2;

public class Datos {
    
    //Atributos:
        private int inversiones;
        private long tiempo;
    //End Atributos.
    
    //Constructor:
        public Datos(int inversiones, long tiempo){
            this.inversiones = inversiones;
            this.tiempo = tiempo;
        }
    //End Constructor.
    
    //Metodos públicos:
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Inversiones: ").append(this.inversiones).append("\n");
            sb.append("Tiempo(ns):  ").append(this.tiempo).append("\n");
            return sb.toString();
        }
    //End Metodos públicos.
    
    //Metodos privados:
    //End Metodos privados.
    
    //Getters:
        public int getInversiones(){return this.inversiones;}
        public long getTiempo(){return this.tiempo;}
    //End Getters.
    
    //Setters:
        public void setInversiones(int inversiones){this.inversiones = inversiones;}
        public void setTiempo(long tiempo){this.tiempo = tiempo;}
    //End Setters.
}
