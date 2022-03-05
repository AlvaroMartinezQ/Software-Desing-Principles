package trabajofds2;

import java.util.Scanner;

public class MainPruebas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduze n:");
        int n = sc.nextInt();
        sc.close();
        Algoritmos pb = new Algoritmos(new Vectores(n, true));
        System.out.println("\nDYV:");
        pb.ejecutarDivideYVenceras();
        System.out.println(pb.toString());
        System.out.println("\nFB:");
        pb.ejecutarFuerzaBruta();
        System.out.println(pb.toString());
    }
}

