package trabajofds2;

public class Algoritmos {
    
    //Atributos:
        private Vectores vs;
        private boolean v1_a_v2;
    //End Atributos.
        
    //Constructor:
        public Algoritmos() {
            this.vs = null;
            this.v1_a_v2 = true;
        }
        public Algoritmos(Vectores vs) {
            this.vs = vs;
            this.v1_a_v2 = true;
        }
        public Algoritmos(Vectores vs, boolean v1_a_v2) {
            this.vs = vs;
            this.v1_a_v2 = v1_a_v2;
        }
    //End Constructor.
    
    //Metodos públicos:
        public Datos ejecutarFuerzaBruta() {
            return fuerzaBruta(this.vs.devolverConvertido(v1_a_v2));
        }
        public Datos ejecutarDivideYVenceras(){
            return divideYVenceras(this.vs.devolverConvertido(v1_a_v2));
        }
        
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if(vs!=null)sb.append(this.vs.toString());
            else sb.append("VS vacíos\n");
            return sb.toString();
        }
    //End Metodos públicos

    //Metodos privados:
        private Datos fuerzaBruta(int[] v){
            
            //Guardamos tiempo de comienzo:
            long t_comienzo = System.nanoTime();
            
            
            int contador = 0;
            for (int i = 0; i < v.length; i++){
                // Comienzo operando por el valor i
                for(int j = i + 1; j < v.length; j++) {
                    // Voy a iterar sobre todo el array restante
                    if((v[i] > v[j]) && (i < j)) {
                        // Si el elemento que esta seleccionado por v[j]
                        // es menor que el elemento que ha seleccionado v[i]
                        // entonces podemos afirmar que hay 1 inversion que
                        // agregar al contador
                        contador++;
                    }
                }
            }
            
            //Guardamos tiempo de finalizado:
            long t_final = System.nanoTime();
            
            //Devolvemos un objeto tipo Datos con el nº de inversiones y el tiempo tardado:
            Datos temp = new Datos(contador, (t_final - t_comienzo));
            return temp;
        }
        private Datos divideYVenceras(int[] v){
            //Guardamos tiempo de comienzo:
            long t_comienzo = System.nanoTime();
            
            //Calculamos el nº de inversiones con DYV:
            int inversiones = calcularInversiones(v);
            
            //Guardamos tiempo de finalizado:
            long t_final = System.nanoTime();
            
            //Devolvemos un objeto tipo Datos con el nº de inversiones y el tiempo tardado:
            Datos temp = new Datos(inversiones, (t_final - t_comienzo));
            return temp;
        }
        private int calcularInversiones(int [] v){
            
            //Caso que el array tenga 1 de longitud:
            if(1 == v.length) return 0;
            
            //Caso normal:
            //Creamos las mitades:
            int m = v.length/2;
            int[] izq = new int[m];
            int[] der = new int[v.length-m];
            
            //Copiamos elemetos:
            for(int i = 0; i < m; i++) izq[i] = v[i];
            for(int i = 0; i < v.length-m; i++) der[i] = v[m+i];
            
            //Contamos cada mitad:
            int sub1 = calcularInversiones(izq);
            int sub2 = calcularInversiones(der);
            
            //Combinamos ambos en un resultado:
            int[] re = new int[v.length];
            int comb = combinar(izq, der, re);
            for (int i = 0; i < v.length; i++) v[i] = re[i];
            return (sub1 + sub2 + comb);
            
        }
        private int combinar(int[] iz, int[] de, int[] re){
            //Inicializamos los indices:
            int i = 0, j = 0, k = 0, cont = 0;
            
            //Contamos las inversiones entre iz y de:
            while((iz.length > i)&&(de.length > j)){
                if(iz[i] < de[j]){
                    re[k] = iz[i];
                    i++;
                }else{
                    re[k] = de[j];
                    j++;
                    cont += iz.length - i;
                }
                k++;
            }
            
            //Cuando uno de los dos arrays lleguen al tope continua 
            //el que falta:
            if(i == iz.length){
                for(int x = j; x < de.length; x++){
                    re[k] = de[x];
                    k++;
                }
            }else{
                for(int x = i; x < iz.length; x++){
                    re[k] = iz[x];
                    k++;
                }
            }   
            return cont;
        }
    //End Metodos privados.
    
    //Setters:
        public void setVectores(Vectores vs){this.vs = vs;}
    //End Setters.
        
    //Getters:
        public Vectores getVS(){return this.vs;}
    //End Getters.
}