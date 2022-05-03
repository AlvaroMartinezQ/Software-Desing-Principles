package Almacenes;

import Iterators.ProfesorIterator;
import Usuarios.Profesor;
import java.util.ArrayList;
import java.util.Iterator;

public class AlmacenProfesores extends Almacen<ArrayList<Profesor>>{
    
    public AlmacenProfesores(int size) {
        super(size);
        datos = new ArrayList<>();
    }
    
    public Iterator<Profesor> createIterator() {
        return new ProfesorIterator(datos, datos.size());
    }
    
    public int añadirProfesor(Profesor p){
        if(datos.size() == size){
            System.out.println("[Error] - No hay hueco en el almacen");
            return -1;
        }
        datos.add(p);
        return 0;
    }
    
    public boolean estaVacio(){
        return datos.size() == 0;
    }
    
}
