package practica_8.Iterator.Main;

import java.util.Iterator;

import practica_8.Iterator.Almacenes.AlmacenAdministradores;
import practica_8.Iterator.Almacenes.AlmacenAlumnos;
import practica_8.Iterator.Almacenes.AlmacenProfesores;
import practica_8.Iterator.Usuarios.Administrador;
import practica_8.Iterator.Usuarios.Alumno;
import practica_8.Iterator.Usuarios.Profesor;
import practica_8.Iterator.Usuarios.Usuario;

public class Login {
	
	private AlmacenAdministradores admins;
    private AlmacenProfesores profesores;
    private AlmacenAlumnos alumnos;
    private int nAdmins, nProfesores, nAlumnos, sizeAlmacenes;
    
    public Login(int sizeAlmacenes){
        this.admins = new AlmacenAdministradores(sizeAlmacenes);
        this.profesores = new AlmacenProfesores(sizeAlmacenes);
        this.alumnos = new AlmacenAlumnos(sizeAlmacenes);
        this.sizeAlmacenes = sizeAlmacenes;
        this.nAdmins = 0;
        this.nProfesores = 0;
        this.nAlumnos = 0;
    }
    
    public void añadirUsuario(Usuario u){
        if(u instanceof Alumno alumno){
            if(alumnos.addAlumno(alumno) == 0)
                nAlumnos++;
        }else if (u instanceof Profesor profesor){
            if(profesores.addProfesor(profesor) == 0)
                nProfesores++;
        }else if (u instanceof Administrador administrador){
            if(admins.addAdministrador(administrador) == 0)
                nAdmins++;
        }else System.out.println("[Error] - Problema al agregar al usuario");
    }
    
    public void imprime(int n){
        System.out.println("}}}}}IMPRESION:");
        if(n == 0 || n < 0){
            while(true){
                System.out.println(stringAlumnos());
                System.out.println(stringProfesores());
                System.out.println(stringAdmins());
            }
        }else{
            for(int i = 0; i < n; i++){
                System.out.println("\t}}Nº"+(i+1)+":\n");
                System.out.println("+Numero de alumnos guardados: "+nAlumnos+"/"+sizeAlmacenes+"\n");
                System.out.println(stringAlumnos());
                System.out.println("+Numero de profesores guardados: "+nProfesores+"/"+sizeAlmacenes+"\n");
                System.out.println(stringProfesores());
                System.out.println("+Numero de administradores guardados: "+nAdmins+"/"+sizeAlmacenes+"\n");
                System.out.println(stringAdmins());
            }
        }
        System.out.println("}}}}}FIN IMPRESION");
    }
    
    private String stringAlumnos(){
        StringBuilder sb = new StringBuilder("\t----Alumnos guardados----\n");
        if(!alumnos.estaVacio()){           
            Iterator<Alumno> i = alumnos.createIterator();
            while(i.hasNext()){
                Alumno a = i.next();
                sb.append("\t-").append(a.getNombre()).append(": ").append(a.getClave()).append("\n");
            }
        }else sb.append("\t-Vacia...\n");
        sb.append("\t--------Fin Lista--------\n\n");
        return sb.toString();
    }
    
    private String stringAdmins(){
        StringBuilder sb = new StringBuilder("\t----Administradores guardados----\n");
        if(!admins.estaVacio()){    
            Iterator<Administrador> i = admins.createIterator();
            while(i.hasNext()){
                Administrador a = i.next();
                sb.append("\t-").append(a.getNombre()).append(": ").append(a.getClave()).append("\n");
            }
        }else sb.append("\t-Vacía...\n");
        sb.append("\t------------Fin Lista------------\n\n");
        return sb.toString();
    }
    
    private String stringProfesores(){
        StringBuilder sb = new StringBuilder("\t----Profesores guardados----\n");
        if(!profesores.estaVacio()){    
            Iterator<Profesor> i = profesores.createIterator();
            while(i.hasNext()){
                Profesor p = i.next();
                sb.append("\t-").append(p.getNombre()).append(": ").append(p.getClave()).append("\n");
            }
        }else sb.append("\t-Vacía...\n");
        sb.append("\t---------Fin Lista----------\n\n");
        return sb.toString();
    }

}
