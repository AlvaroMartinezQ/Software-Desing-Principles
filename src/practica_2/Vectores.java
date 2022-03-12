package practica_2;

import java.util.Random;

public class Vectores {
    
    //Atributos:
        private int n;
        private int[] vector1;
        private int[] vector2;
    //End Atributos.
    
    //Constructor:
        public Vectores(int n, boolean initAleatorio) {
            this.n = n;
            this.vector1 = new int[n];
            this.vector2 = new int[n];
            if(initAleatorio == true) rellenarAleatorio();
        }
    //End Constructor.
    
    //Metodos públicos:
        public int[] devolverConvertido(boolean v1_a_v2){
            //Creamos un v_temp con el cual calcularemos las inversiones:
            int[] v_temp = new int[this.n];
            
            if(v1_a_v2){
                //En el vector temp introducimos los datos de vector1 pero cambiados utilizando de modelo vector2:
                for(int i = 0; i < this.n; i++)
                    v_temp[i] = posicionEnVector(vector1[i], vector2);
            }else{
                //En el vector temp introducimos los datos de vector1 pero cambiados utilizando de modelo vector2:
                for(int i = 0; i < this.n; i++)
                    v_temp[i] = posicionEnVector(vector2[i], vector1);
            }
            return v_temp;
        }
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("\n\n");
            sb.append("N = ").append(this.n);
            sb.append("\n\n");
            sb.append("VECTOR1:{");
            for(int i = 0; i < this.n; i++){
                sb.append(vector1[i]);
                if(i != this.n - 1) sb.append(",");
            }
            sb.append("}");
            sb.append("\n\n");
            sb.append("VECTOR2:{");
            for(int i = 0; i < this.n; i++){
                sb.append(vector2[i]);
                if(i != this.n - 1) sb.append(",");
            }
            sb.append("}");
            sb.append("\n\n");

            return sb.toString();
        }
    //End Metodos públicos.
    
    //Metodos privados:
        private void rellenarAleatorio() {
            Random rdn = new Random();
            for(int i = 0; i < this.n; i++){
                do{vector1[i] = rdn.nextInt(this.n) + 1;}while(existeElemento(vector1[i], vector1, i-1));
                do{vector2[i] = rdn.nextInt(this.n) + 1;}while(existeElemento(vector2[i], vector2, i-1));
            }
        }
        private boolean existeElemento(int elemento, int[] v, int indexMax){
            if(indexMax == -1) return false;
            for(int i = 0; i <= indexMax; i++) 
                if(v[i] == elemento) 
                    return true;
            return false;
        }
        private int posicionEnVector(int elemento, int[] v){
            for(int i = 0; i < v.length;  i++)
                if(v[i] == elemento)
                    return i;
            return -1;
        }
    //End Metodos privados.
    
    //Getters:
        public int getN(){return this.n;}
        public int[] getVector1(){return this.vector1;}
        public int[] getVector2(){return this.vector2;}
    //End Getters.
    
    //Setters:
        public void setN(int n){this.n = n;}
        public void setVector1(int[] vector1){this.vector1 = vector1;}
        public void setVector2(int[] vector2){this.vector2 = vector2;}
    //End Setters.
}
