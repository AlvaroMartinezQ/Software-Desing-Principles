package Punto2D;

import java.util.Random;

public class TestSingleton {
    private Punto2DSingleton punto1, punto2;
    private Random rdn = new Random();
    
    public TestSingleton(){
        punto1 = Punto2DSingleton.getInstance();
        punto2 = Punto2DSingleton.getInstance();
    }
    
    public void ejecutarTest(){
        StringBuilder sb = new StringBuilder("---Prueba TestSingleton:\n\n");
        
        sb.append("Punto1: ").append(punto1.toString()).append("\n");
        sb.append("Punto2: ").append(punto2.toString()).append("\n");
        boolean equal1 = punto1.equals(punto2);
        sb.append("¿Puntos iguales?: ").append(equal1);
        
        sb.append("\n\n-Cambiamos los valores del segundo punto: ");
        int x = rdn.nextInt(100), y = rdn.nextInt(100);
        sb.append("Nuevos valores -> x:").append(x).append(", y:").append(y);
        
        punto2.setX(x); 
        punto2.setY(y);
        
        sb.append("\n\n-Nuevos Puntos:\n\n");
        
        sb.append("Punto1: ").append(punto1.toString()).append("\n");
        sb.append("Punto2: ").append(punto2.toString()).append("\n");
        boolean equal2 = punto1.equals(punto2);
        sb.append("¿Puntos iguales?: ").append(equal2);
        
        sb.append("\n\n-Conclusiones:\n\n");
        if(equal1 && equal2) sb.append("Podemos concluir que el patron singleton funciona sin problemas.");
        else sb.append("Podemos concluir que el patron singleton tiene un fallo en su escritura.");
        
        sb.append("\n\n---Fin Prueba TestSingleton.\n\n");
        
        System.out.println(sb.toString());
    }
}
