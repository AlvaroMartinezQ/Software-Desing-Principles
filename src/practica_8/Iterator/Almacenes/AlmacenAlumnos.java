package practica_8.Iterator.Almacenes;

import java.util.Iterator;

import practica_8.Iterator.Iterators.AlumnoIterator;
import practica_8.Iterator.Usuarios.Alumno;

public class AlmacenAlumnos extends Almacen<Alumno[]> {
	
	public AlmacenAlumnos(int size) {
        super(size);
        datos = new Alumno[1];
    }
    
    public Iterator<Alumno> createIterator() {
        return new AlumnoIterator(datos, size);
    }
    
    public int addAlumno(Alumno a){
        if(datos.length == size){ 
            System.out.println("[Error] - No hay hueco en el almacen");
            return -1;
        }
        Alumno[] copia = datos;
        datos = new Alumno[datos.length+1];
        for(int i = 0; i < datos.length; i++){
            if(i != datos.length-1) datos[i] = copia[i];
            else datos[i] = a;
        }
        return 0;
    }
    
    public boolean estaVacio(){
        return datos[0] == null;
    }

}
