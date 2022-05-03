package Almacenes;


import Iterators.AdministradorIterator;
import Usuarios.Administrador;
import LinkedList.*;
import java.util.Iterator;


public class AlmacenAdministradores extends Almacen<LinkedList1<Administrador>>{
    
    public AlmacenAdministradores(int size) {
        super(size);
        this.datos = new LinkedList1<>();
    }

    public Iterator<Administrador> createIterator() {
        return new AdministradorIterator(datos, datos.getSize());
    }
    
    public int añadirAdministrador(Administrador a){
        if(datos.getSize() == size){
            System.out.println("[Error] - No hay hueco en el almacen");
            return -1;
        }
        datos.addLast(a);
        return 0;
    }
    
    public boolean estaVacio(){
        return datos.getSize() == 0;
    }
}
