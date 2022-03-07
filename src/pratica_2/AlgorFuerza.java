package pratica_2;

public class AlgorFuerza {
    private int contador; // numero de inversion
    private double tiempo;

    public AlgorFuerza() {
        this.contador = 0;
        this.tiempo = 0.0;
    }

    public String exec_fuerza(int[] v) {
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
        this.contador = contador;

        long t_final = System.nanoTime();
        this.tiempo = t_final - t_comienzo;
        return this.toString();
    }

    public String toString() {
        return (
            "La inversion de la ejecucion es de: "
            + this.contador
            + ", ha tardado en ejecutar: "
            + this.tiempo + " ms."
        );
    }

}
