package practica_2;

public class MainPruebas {
    public static void main(String[] args){
        Algoritmos ag = new Algoritmos(new Vectores(1000, true), true);
        System.out.println(ag.getVS().toString());
        System.out.println(ag.ejecutarDivideYVenceras().toString());
        System.out.println(ag.ejecutarFuerzaBruta().toString());
    }
}

