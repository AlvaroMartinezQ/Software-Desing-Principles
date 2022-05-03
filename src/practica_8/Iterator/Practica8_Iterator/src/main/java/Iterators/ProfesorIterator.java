package Iterators;

import Usuarios.Profesor;
import java.util.ArrayList;
import java.util.Iterator;

public class ProfesorIterator implements Iterator<Profesor>{

    private ArrayList<Profesor> list;
    private int size;
    private int pos;
    
    public ProfesorIterator(ArrayList<Profesor> list, int size){
        this.list = list;
        this.size = size;
        this.pos = 0;
    }
    
    @Override
    public boolean hasNext() {
        return !(pos >= size || list.get(pos) == null);
    }

    @Override
    public Profesor next() {
        Profesor a;
        if(pos != size){
            a = list.get(pos);
            pos++;
        }else{
            a = list.get(0);
            pos = 1;
        }
        return a;
    }

    @Override
    public void remove() {
        if (pos > 0){ 
            if (list.get(pos-1) != null) {
                for (int i = pos-1; i < (size-1); i++)
                    list.set(i, list.get(i+1)); 
                list.set(size-1, null); 
            }
        }
    }
    
    public int getSize(){
        return size;
    }
    
}
