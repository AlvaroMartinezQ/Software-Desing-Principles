package practica_8.Iterator.Almacenes;

import java.util.*;

import practica_8.Iterator.Usuarios.Administrador;
import practica_8.Iterator.Iterators.AdministradorIterator;

public class AlmacenAdministradores extends Almacen<LinkedList<Administrador>> {

	public AlmacenAdministradores(int size) {
        super(size);
        this.datos = new LinkedList<>();
    }

    public Iterator<Administrador> createIterator() {
        return new AdministradorIterator(datos, datos.size());
    }
    
    public int addAdministrador(Administrador a){
        if(datos.size() == size){
            System.out.println("[Error] - No hay hueco en el almacen");
            return -1;
        }
        datos.add(a);
        return 0;
    }
    
    public boolean estaVacio(){
        return datos.size() == 0;
    }
	
}
