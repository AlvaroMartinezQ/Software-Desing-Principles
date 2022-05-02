package practica_8.Iterator.Main;

import java.util.Scanner;

import practica_8.Iterator.Usuarios.Administrador;
import practica_8.Iterator.Usuarios.Alumno;
import practica_8.Iterator.Usuarios.Profesor;
import practica_8.Iterator.Usuarios.Usuario;

public class Main {
	
	private static Login log = new Login(30);
    
    public static void main(String[] args) {
        menu();
    }
    
    private static void menu() {
        boolean salir = false;
        System.out.println("+-----Menu Login-----+");
        System.out.println("+1.Añadir Usuario    +");
        System.out.println("+2.Imprimir almacenes+");
        System.out.println("+3.Salir             +");
        System.out.println("+------Fin Menu------+");
        while(!salir){
            Scanner sc = new Scanner(System.in);
            System.out.println("\nIntroduzca opcion valida:");
            int opcion = sc.nextInt();
            System.out.println();
            int n;
            sc.nextLine();
            if(opcion > 0 && opcion < 4){
                switch(opcion){
                    case 1:
                        System.out.println("\n\nIntroduzca nombre:");
                        String nombre = sc.nextLine();
                        System.out.println("Introduzca clave:");
                        String clave = sc.nextLine();
                        System.out.println("Introduzca si es alumno, profesor o admin (1,2,3):");
                        n = sc.nextInt();
                        Usuario u;
                        switch(n){
                            case 1:
                                u = new Alumno(nombre, clave);
                                log.añadirUsuario(u);
                                break;
                            case 2:
                                u = new Profesor(nombre, clave);
                                log.añadirUsuario(u);
                                break;
                            case 3:
                                u = new Administrador(nombre, clave);
                                log.añadirUsuario(u);
                                break;
                            default:
                                System.out.println("[Error] - Opcion no valida.");
                        }
                        break;
                    case 2:
                        System.out.println("Introduzca el numero de veces a imprimir(-1 o 0 -> infinito):");
                        n = sc.nextInt();
                        log.imprime(n);
                        sc.nextLine();
                        break;
                    case 3:
                        salir = true;
                        sc.close();
                        break;
                    default:
                        System.out.println("[Error] - Opcion no valida.");
                }
            }else{
                System.out.println("[Error] - Opcion no valida.");
            }
        }
        System.out.println("Bye");
    }

}
