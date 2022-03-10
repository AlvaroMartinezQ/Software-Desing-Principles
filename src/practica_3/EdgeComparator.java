package trabajofds3;

import java.util.Comparator;

public class EdgeComparator implements Comparator<Edge>{
    
    //Atributos:
    //End Atributos.
    
    //Constructores:
    //End Constructores.
    
    //Metodos publicos:
        @Override
        public int compare(Edge edge1, Edge edge2){
            if (edge1.getLength() == edge2.getLength())
            return 0;
            else if (edge1.getLength() > edge2.getLength())
            return 1;
            else
            return -1;
        }
    //End Metodos publicos.
    
    //Metodos privados:
    //End Metodos privados.
        
    //Getters:
    //End Getters.
        
    //Setters:
    //End Setters.
}