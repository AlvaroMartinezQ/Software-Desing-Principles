package practica_8.Iterator.Iterators;

import java.util.Iterator;
import java.util.LinkedList;

import practica_8.Iterator.Usuarios.Administrador;

public class AdministradorIterator implements Iterator<Administrador> {

	private LinkedList<Administrador> list;
    private int size;
    private int pos;
    
    public AdministradorIterator(LinkedList<Administrador> list, int size){
        this.list = list;
        this.pos = 0;
        this.size = size;
    }
    
    @Override
    public boolean hasNext() {
        return !(pos >= size || list.get(pos) == null);
    }

    @Override
    public Administrador next() {
        Administrador a;
        if(pos != list.size()){
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
