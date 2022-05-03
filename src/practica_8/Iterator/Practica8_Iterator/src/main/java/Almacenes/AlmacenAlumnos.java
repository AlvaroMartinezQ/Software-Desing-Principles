package Almacenes;

import Iterators.AlumnoIterator;
import Usuarios.Alumno;
import java.util.Iterator;

public class AlmacenAlumnos extends Almacen<Alumno[]>{
    
    int piv;

    public AlmacenAlumnos(int size) {
        super(size);
        datos = new Alumno[size];
        piv = 0;
    }
    
    public Iterator<Alumno> createIterator() {
        return new AlumnoIterator(datos, size);
    }
    
    public int añadirAlumno(Alumno a){
        if(piv == size){ 
            System.out.println("[Error] - No hay hueco en el almacen");
            return -1;
        }
        datos[piv] = a;
        piv++;
        return 0;
    }
    
    public boolean estaVacio(){
        return datos[0] == null;
    }
    
}
