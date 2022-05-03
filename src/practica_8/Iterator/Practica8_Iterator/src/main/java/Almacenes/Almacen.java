package Almacenes;

public class Almacen<T>{
    
    protected int size;
    protected T datos;
    
    public Almacen(int size){
        this.size = size;
    }
    
    public T getAlmacen(){
        return datos;
    }
    
    public int getSize(){return this.size;}
    
    
}
