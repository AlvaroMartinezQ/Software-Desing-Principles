package practica_8.Strategy;

public class Directo implements OrdenaAlgoritmo{

	@Override
    public int[] ordenar(int[] array) {
        System.out.println("Ordenando por seleccion directa.");
        int n = array.length; 
        for (int i = 0; i < n-1; i++) {
            int min_idx = i; 
            for (int j = i+1; j < n; j++){
                if (array[j] < array[min_idx]){
                    min_idx = j; 
                }
            }
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        }
        return array;
    }
    
}
