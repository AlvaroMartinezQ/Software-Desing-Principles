package pratica_2;

import java.util.concurrent.ThreadLocalRandom;

public class Vectores {
    private int longitud;
    private int[] vector_1; // Gustos usuario 1
    private int[] vector_2; // Gustos usuario 2

    public Vectores(int longitud) {
        this.longitud = longitud;
        this.vector_1 = new int[this.longitud];
        this.vector_2 = new int[this.longitud];
        this.init();
    }

    public void imprime_vectores() {
        System.out.println();
        System.out.print("Primer vector: [");
        imprime(this.vector_1);
        System.out.print("]");
        System.out.println();
        System.out.print("Segundo vector: [");
        imprime(this.vector_2);
        System.out.print("]");
        System.out.println();
    }

    private void imprime(int[] v) {
        for(int i = 0; i < v.length; i++) {
            if(i < v.length - 1) {
                System.out.print(v[i] + ", ");
            } else {
                System.out.print(v[i]);
            }
        }
    }

    public int[] get_vector_1() {
        return this.vector_1;
    }

    public int[] get_vector_2() {
        return this.vector_2;
    }

    private void init() {
        boolean libre;
        int id;
        for(int i = 0; i < this.longitud; i++) {
            libre = false;
            // Al usuario 1 le gusta ese objeto i+1 en la posicion i:
            this.vector_1[i] = i+1;
            // Al usuario 2 le gusta ese objeto i+1 en una posicion random del array
            while(!libre){
                // Generamos un id
                id = ThreadLocalRandom.current().nextInt(0, this.longitud);
                // Buscar una posicion libre para insertar
                if(vector_2[id] == 0) {
                    // Insertamos en esa posicion
                    vector_2[id] = i+1;
                    libre = true;
                }
            }
        }
    }

}
