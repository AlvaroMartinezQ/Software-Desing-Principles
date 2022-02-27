package mavenproject.pratica_1;

import java.util.Random;

public class VectorOrdenable {

    // Atributos:
    private int numeroDeElementos;
    private int[] vector;
    // End Atributos.

    // Constructor:
    public VectorOrdenable() {
        numeroDeElementos = 0;
        vector = null;
    }
    // End Constructor.

    // Métodos públicos:
    public void rellenaVectorEnOrden(int n) {
        // Inicializamos el vector de n elementos y el numero de elementos.
        vector = new int[n];
        this.numeroDeElementos = n;

        // Rellenamos el vector en orden.
        for (int i = 1; i <= n; i++)
            vector[i - 1] = i;
    }

    public void rellenaVectorEnOrdenInverso(int n) {
        // Inicializamos el vector de n elementos y el numero de elementos.
        vector = new int[n];
        this.numeroDeElementos = n;

        // Rellenamos el vector en orden.
        for (int i = n; i >= 1; i--)
            vector[n - i] = i;
    }

    public void rellenaVectorAleatoriamente(int n, int max) {
        // Inicializamos el vector de n elementos y el numero de elementos.
        vector = new int[n];
        this.numeroDeElementos = n;

        // Inicializamos el objeto random.
        Random rnd = new Random();

        // Rellenamos el vector con elementos aleatorios entre 1 y max.
        for (int i = 0; i < n; i++)
            vector[i] = rnd.nextInt(max + 1);
    }

    public void imprimeVector() {
        System.out.println(this.toString());
    }

    public long ordenaPorBurbuja() {
        // Pedimos el horario de comienzo en milisegundos y lo guardamos en una
        // variable.
        long start = System.nanoTime();

        // Ordenamos el array
        burbuja(this.vector);

        // Pedimos el horario de finalizacion en milisegundos y lo guardamos en una
        // variable.
        long finish = System.nanoTime();

        // Retornamos la diferencia entre los tiempos para saber cuanto tardo el
        // algoritmo.
        return finish - start;
    }

    public long ordenaPorSeleccionDirecta() {
        // Pedimos el horario de comienzo en milisegundos y lo guardamos en una
        // variable.
        long start = System.nanoTime();

        // Ordenamos el array
        selectSort(this.vector);

        // Pedimos el horario de finalizacion en milisegundos y lo guardamos en una
        // variable.
        long finish = System.nanoTime();

        // Retornamos la diferencia entre los tiempos para saber cuanto tardo el
        // algoritmo.
        return finish - start;
    }

    public long ordenaPorMezcla() {
        // Pedimos el horario de comienzo en milisegundos y lo guardamos en una
        // variable.
        long start = System.nanoTime();

        // Ordenamos el array
        mergeSort(this.vector);

        // Pedimos el horario de finalizacion en milisegundos y lo guardamos en una
        // variable.
        long finish = System.nanoTime();

        // Retornamos la diferencia entre los tiempos para saber cuanto tardo el
        // algoritmo.
        return finish - start;
    }

    @Override
    public String toString() {
        return vectorAString();
    }
    // End Métodos públicos.

    // Métodos privados:
    private String vectorAString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vector No Volátil | NumeroDeElementos: ");
        sb.append(this.numeroDeElementos + "\n Elementos: [");
        for (int i = 0; i < this.numeroDeElementos; i++) {
            sb.append(vector[i]);
            if (i != this.numeroDeElementos - 1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    private static void burbuja(int[] v) {
        int n = v.length;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = v.length - 1; j > i; j--) {
                if (v[j - 1] > v[j]) {
                    int temp = v[j - 1];
                    v[j - 1] = v[j];
                    v[j] = temp;
                }
            }
        }
    }

    private static void selectSort(int[] v) {
        int m;
        for (int i = 0; i < v.length - 1; i++) {
            m = i;
            for (int j = i + 1; j < v.length; j++)
                if (v[j] < v[m])
                    m = j;
            int aux = v[i];
            v[i] = v[m];
            v[m] = aux;
        }
    }

    private static void mergeSort(int[] v) {
        sort(v, 0, v.length - 1);
    }

    private static void sort(int[] v, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(v, l, m);
            sort(v, m + 1, r);
            merge(v, l, m, r);
        }
    }

    private static void merge(int[] v, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++)
            left[i] = v[l + 1];
        for (int j = 0; j < n2; j++)
            right[j] = v[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                v[k] = left[i];
                i++;
            } else {
                v[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            v[k] = left[i];
            i++;
            j++;
        }
        while (j < n2) {
            v[k] = right[j];
            j++;
            k++;
        }
    }
    // End Métodos priavados.

    // Getters:
    public int getNumeroDeElementos() {
        return this.numeroDeElementos;
    }

    public int[] getVector() {
        return this.vector;
    }
    // End Getters.

    // Setters:
    public void setNumeroDeElementos(int numeroDeElementos) {
        this.numeroDeElementos = numeroDeElementos;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }
    // End Setters.
}
