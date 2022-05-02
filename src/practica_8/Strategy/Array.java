package practica_8.Strategy;

public class Array extends Ordenador {
    
	private int[] array;
    
    public Array(int[] array){
        super();
        this.array = array;
    }

    @Override
    public void imprime() {
        System.out.println("El array:");
        for(int i = 0; i < array.length; i++){
            System.out.print("["+array[i] + "] ");
        }
        System.out.println("");
    }

    @Override
    public void ordenar() {
        oa.ordenar(this.array);
    }

    @Override
    public void setArray(int[] array) {
        this.array = array;
    }

}
