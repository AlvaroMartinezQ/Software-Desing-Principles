package practica_1;

public class Complejidad {

    // Atributos:
    private int numeroDeIteraciones;
    private MatrizDeTiempos matrizTiempos;
    private VectorOrdenable vector;
    private VectorOrdenableVolatile vectorVolatile;
    private final String[] titulos = {
        "CasoPeorBurbujaNormal",
        "CasoMedioBurbujaNormal",
        "CasoMejorBurbujaNormal",
        "CasoPeorSeleccionDirectaNormal",
        "CasoMedioSeleccionDirectaNormal",
        "CasoMejorSeleccionDirectaNormal",
        "CasoPeorMezclaNormal",
        "CasoMedioMezclaNormal",
        "CasoMejorMezclaNormal",
        "CasoPeorBurbujaVolatile",
        "CasoMedioBurbujaVolatile",
        "CasoMejorBurbujaVolatile",
        "CasoPeorSeleccionDirectaVolatile",
        "CasoMedioSeleccionDirectaVolatile",
        "CasoMejorSeleccionDirectaVolatile",
        "CasoPeorMezclaVolatile",
        "CasoMedioMezclaVolatile",
        "CasoMejorMezclaVolatile"
    };
    // End Atributos.

    // Constructor:
    public Complejidad(int numeroDeIteraciones) {
        this.numeroDeIteraciones = numeroDeIteraciones;
        this.matrizTiempos = new MatrizDeTiempos(
            numeroDeIteraciones,
            this.titulos.length,
            titulos
        );
        this.vector = new VectorOrdenable();
        this.vectorVolatile = new VectorOrdenableVolatile();
    }
    // End Constructor.

    // Métodos públicos:
    public void ejecutarAlgoritmos() {
        ejecutarBurbuja();
        ejecutarSeleccion();
        ejecutarMezcla();
    }

    public void imprimeTiempos() {
        matrizTiempos.imprimeTiempos();
    }

    public void guardarDatos(String outputFilePath) {
        matrizTiempos.guardaTiempos(outputFilePath);
    }
    // End Métodos públicos.

    // Métodos privados:
    private void ejecutarBurbuja() {
        // Burbuja Normal:
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vector.rellenaVectorEnOrdenInverso(i);
            matrizTiempos.asignaValor(i - 1, 0, vector.ordenaPorBurbuja());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vector.rellenaVectorAleatoriamente(i, i);
            matrizTiempos.asignaValor(i - 1, 1, vector.ordenaPorBurbuja());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vector.rellenaVectorEnOrden(i);
            matrizTiempos.asignaValor(i - 1, 2, vector.ordenaPorBurbuja());
        }
        // Burbuja Volatil:
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vectorVolatile.rellenaVectorEnOrdenInverso(i);
            matrizTiempos.asignaValor(i - 1, 9, vectorVolatile.ordenaPorBurbuja());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vectorVolatile.rellenaVectorAleatoriamente(i, i);
            matrizTiempos.asignaValor(i - 1, 10, vectorVolatile.ordenaPorBurbuja());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vectorVolatile.rellenaVectorEnOrden(i);
            matrizTiempos.asignaValor(i - 1, 11, vectorVolatile.ordenaPorBurbuja());
        }
    }

    private void ejecutarSeleccion() {
        // Seleccion Directa Normal:
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vector.rellenaVectorEnOrdenInverso(i);
            matrizTiempos.asignaValor(i - 1, 3, vector.ordenaPorSeleccionDirecta());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vector.rellenaVectorAleatoriamente(i, i);
            matrizTiempos.asignaValor(i - 1, 4, vector.ordenaPorSeleccionDirecta());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vector.rellenaVectorEnOrden(i);
            matrizTiempos.asignaValor(i - 1, 5, vector.ordenaPorSeleccionDirecta());
        }
        // Seleccion Directa Volatil:
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vectorVolatile.rellenaVectorEnOrdenInverso(i);
            matrizTiempos.asignaValor(i - 1, 12, vectorVolatile.ordenaPorSeleccionDirecta());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vectorVolatile.rellenaVectorAleatoriamente(i, i);
            matrizTiempos.asignaValor(i - 1, 13, vectorVolatile.ordenaPorSeleccionDirecta());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vectorVolatile.rellenaVectorEnOrden(i);
            matrizTiempos.asignaValor(i - 1, 14, vectorVolatile.ordenaPorSeleccionDirecta());
        }
    }

    private void ejecutarMezcla() {
        // Mezcla Normal:
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vector.rellenaVectorEnOrdenInverso(i);
            matrizTiempos.asignaValor(i - 1, 6, vector.ordenaPorMezcla());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vector.rellenaVectorAleatoriamente(i, i);
            matrizTiempos.asignaValor(i - 1, 7, vector.ordenaPorMezcla());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vector.rellenaVectorEnOrden(i);
            matrizTiempos.asignaValor(i - 1, 8, vector.ordenaPorMezcla());
        }
        // Mezcla Volatil:
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vectorVolatile.rellenaVectorEnOrdenInverso(i);
            matrizTiempos.asignaValor(i - 1, 15, vectorVolatile.ordenaPorMezcla());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vectorVolatile.rellenaVectorAleatoriamente(i, i);
            matrizTiempos.asignaValor(i - 1, 16, vectorVolatile.ordenaPorMezcla());
        }
        for (int i = 1; i <= numeroDeIteraciones; i++) {
            vectorVolatile.rellenaVectorEnOrden(i);
            matrizTiempos.asignaValor(i - 1, 17, vectorVolatile.ordenaPorMezcla());
        }
    }
    // End Métodos privados.

    // Setters:
    public void setNumeroDeIteraciones(int numeroDeIteraciones) {
        this.numeroDeIteraciones = numeroDeIteraciones;
    }

    public void setMatrizTiempos(MatrizDeTiempos matrizTiempos) {
        this.matrizTiempos = matrizTiempos;
    }

    public void setVectorOrdenable(VectorOrdenable vector) {
        this.vector = vector;
    }

    public void setVectorOrdenableVolatile(VectorOrdenableVolatile vectorVolatile) {
        this.vectorVolatile = vectorVolatile;
    }
    // End Setters.

    // Getters:
    public int getNumeroDeIteraciones() {
        return this.numeroDeIteraciones;
    }

    public MatrizDeTiempos getMatrizTiempos() {
        return this.matrizTiempos;
    }

    public VectorOrdenable getVectorOrdenable() {
        return this.vector;
    }

    public VectorOrdenableVolatile getVectorOrdenableVolatile() {
        return this.vectorVolatile;
    }

    public String[] getTitulos() {
        return this.titulos;
    }
    // End Getters.

}
