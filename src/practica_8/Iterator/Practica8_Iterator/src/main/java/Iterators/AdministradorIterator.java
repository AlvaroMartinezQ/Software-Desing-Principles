package Iterators;

import Usuarios.Administrador;
import java.util.Iterator;
import LinkedList.*;
import Usuarios.Usuario;

public class AdministradorIterator implements Iterator<Administrador>{

    private LinkedList1<Administrador> list;
    private int size;
    private int pos;
    
    public AdministradorIterator(LinkedList1<Administrador> list, int size){
        this.list = list;
        this.pos = 0;
        this.size = size;
    }
    
    @Override
    public boolean hasNext() {
        Usuario e = null;
        if(pos < size){
            try{
                e  = list.get(pos);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return !(e == null);
    }

    @Override
    public Administrador next() {
        Administrador a = null;
        try{
            if(pos != list.getSize()){
                a = list.get(pos);
                pos++;
            }else{
                a = list.get(0);
                pos = 1;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return a;
    }

    @Override
    public void remove() {
        try{
            if (pos > 0){ 
                if (list.get(pos-1) != null) {
                    for (int i = pos-1; i < (size-1); i++)
                        list.add(list.get(i+1), i); 
                    list.add(null, size-1); 
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    public int getSize(){
        return size;
    }
}
