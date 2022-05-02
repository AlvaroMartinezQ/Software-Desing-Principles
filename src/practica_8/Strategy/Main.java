package practica_8.Strategy;

public class Main {
	
	public static void main(String[] argv){
        
        int[] array = {5, 22, 50, 4, 5, 1, 7, 2, 9, 10};
        
        Ordenador o = new Array(array);
        
        Directo od = new Directo();
        Burbuja ob = new Burbuja();
        
        o.imprime();
        o.setOA(od);
        o.ordenar();
        o.imprime();
        
        int[] array2 = {7, 2132, 23212342, 3432, 2, 9999999, 34545, 453456, 76678, 10};
        o.setArray(array2);
        o.imprime();
        o.setOA(ob);
        o.ordenar();
        o.imprime();
    }

}
