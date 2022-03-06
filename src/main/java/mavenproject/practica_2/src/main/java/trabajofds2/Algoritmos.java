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
            
            //Creamos un contador de inversiones y un elem que contega el elemento a calcular inversiones:
            int inversiones = 0;
            int elem;
            
            //Hacemos un bucle que recorra cada elemento del array:
            for (int i = 0; i < v.length; i++){
                // Comienzo operando por el valor i
                elem = v[i];
                // Voy a iterar sobre todo el array restante
                for(int j = i + 1; j < v.length; j++) 
                    // Si el elemento que esta seleccionado por v[j]
                    // es menor que el elemento que ha seleccionado v[i]
                    // entonces podemos afirmar que hay 1 inversion que
                    // agregar al contador
                    if(elem > v[j]) 
                        inversiones++;    
            }
            
            //Guardamos tiempo de finalizado:
            long t_final = System.nanoTime();
            
            //Devolvemos un objeto tipo Datos con el nº de inversiones y el tiempo tardado:
            Datos temp = new Datos(inversiones, (t_final - t_comienzo));
            return temp;
        }
        private Datos divideYVenceras(int[] v){
            //Guardamos tiempo de comienzo:
            long t_comienzo = System.nanoTime();
            
            //Calculamos el nº de inversiones con DYV:
            int inversiones = calcularInversiones(v, 0, v.length-1);
            
            //Guardamos tiempo de finalizado:
            long t_final = System.nanoTime();
            
            //Devolvemos un objeto tipo Datos con el nº de inversiones y el tiempo tardado:
            Datos temp = new Datos(inversiones, (t_final - t_comienzo));
            return temp;
        }
        private int calcularInversiones(int [] v, int l, int r){
            if(l == r - 1){
                if(v[l]>v[r])return 1;
                else return 0;
            }else if(l == r){
                return 0;
            }else{
                int m = (r-l)/2;
                int sub1 = calcularInversiones(v, l, m);
                int sub2 = calcularInversiones(v, m+1, r); 
                int comb = combinar(v, l, m, r);
                return sub1 + sub2 + comb;
            }
        }
        private int combinar(int[] v, int l, int m, int r){
            int cont = 0;
            for(int i = l; i<=m; i++)
                for(int j = m+1; j<=r; j++)
                    if(v[i]>v[j])
                        cont++;
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
