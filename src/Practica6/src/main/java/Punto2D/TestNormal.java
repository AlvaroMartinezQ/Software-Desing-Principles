package Punto2D;

import java.util.Random;

public class TestNormal {
    
    private Punto2D punto1, punto2;
    private Random rdn = new Random();
    
    public TestNormal(){
        punto1 = new Punto2D(rdn.nextInt(100),rdn.nextInt(100));
        punto2 = new Punto2D(rdn.nextInt(100),rdn.nextInt(100));
    }
    
    public void ejecutarTest(){
        StringBuilder sb = new StringBuilder("---Prueba TestNormal:\n\n");
        
        sb.append("Punto1: ").append(punto1.toString()).append("\n");
        sb.append("Punto2: ").append(punto2.toString()).append("\n");
        sb.append("¿Puntos iguales?: ").append(punto1.equals(punto2));
        
        sb.append("\n\n-Cambiamos los valores de los puntos: ");
        int x1 = rdn.nextInt(100), x2 = rdn.nextInt(100), y1 = rdn.nextInt(100), y2 = rdn.nextInt(100);
        sb.append("Nuevos valores -> x1:").append(x1).append(", x2:");
        sb.append(x2).append(", y1:").append(y1).append(", y2:").append(y2);
        
        punto1.setX(x1); 
        punto1.setY(y1);
        punto2.setX(x2); 
        punto2.setY(y2);
        
        sb.append("\n\n-Nuevos Puntos:\n\n");
        
        sb.append("Punto1: ").append(punto1.toString()).append("\n");
        sb.append("Punto2: ").append(punto2.toString()).append("\n");
        sb.append("¿Puntos iguales?: ").append(punto1.equals(punto2));
        
        sb.append("\n\n-Conclusiones:\n\n");
        
        sb.append("Podemos concluir que salvo coincidencia los puntos conservan total desigualdad."); 
        
        sb.append("\n\n---Fin Prueba TestNormal.\n\n");
        
        System.out.println(sb.toString());
    }
}
