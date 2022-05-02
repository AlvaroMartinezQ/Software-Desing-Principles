package practica_8.Strategy;

public abstract class Ordenador {
	
	protected OrdenaAlgoritmo oa;
    
    public void setOA(OrdenaAlgoritmo oa){
        this.oa = oa;
    }
    
    public abstract void imprime();
    public abstract void ordenar();
    public abstract void setArray(int[] array);

}
