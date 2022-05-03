package Iterators;

import Usuarios.Alumno;
import java.util.Iterator;

public class AlumnoIterator implements Iterator<Alumno>{

    private Alumno[] list;
    private int size;
    private int pos;
    
    public AlumnoIterator(Alumno[] list, int size){
        this.list = list;
        this.size = size;
        this.pos = 0;
    } 
    
    @Override
    public boolean hasNext() {
        return !(pos >= size || list[pos] == null);
    }

    @Override
    public Alumno next() {
        Alumno a;
        if(pos < size){
            a = list[pos];
            pos++;
        }else{
            a = list[0];
            pos = 1;
        }
        return a;}

    @Override
    public void remove() {
        if (pos > 0){ 
            if (list[pos-1] != null) {
                for (int i = pos-1; i < (size-1); i++)
                    list[i] = list[i+1]; 
                list[size-1] = null; 
            }
        }
    }
    
    public int getSize(){
        return size;
    }
}
