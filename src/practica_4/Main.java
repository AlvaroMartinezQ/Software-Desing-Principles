package practica_4;

import java.util.Scanner;

public class Main {
	
        public static void main(String[] argv) {
            Caballo c = new Caballo();
            Scanner in = new Scanner(System.in);
            boolean salir = false;
            int sel;
            do{
                System.out.println("------Menu Seleccion:-----");
                System.out.println("+1.Pruebas Personalizadas");
                System.out.println("+2.Pruebas Tablas");
                System.out.println("+3.Pruebas Globales");
                System.out.println("+4-?.Salir");
                System.out.println("--------------------------");
                sel = in.nextInt();  
                switch(sel){
                    case 0: default:
                        salir = true;
                        break;
                    case 1:
                        c.execUsuario();
                        break;
                    case 2:
                        c.execPruebas();
                        break;
                    case 3:
                        c.execPruebasGlobales();
                        break;
                }
            }while(!salir);
	}
}
