package trabajofds3;

import java.util.ArrayList;

public class Subset {
    
    //Atributos:
        private ArrayList<String> nodes;
    //End Atributos.
    
    //Constructores:
        public Subset() {
            this.nodes = new ArrayList<String>();
        }
        public Subset(Subset subset1, Subset subset2) {
            this();
            for (String node : subset1.nodes) this.nodes.add(node);
            for (String node : subset2.nodes) this.nodes.add(node);
        }
    //End Constructores.
    
    //Metodos publicos:
        public void AddNode(String node) {
            this.nodes.add(node);
        }
        public boolean Find(String node) {
            return this.nodes.contains(node);
        }
        public boolean FindBoth(String node1, String node2) {
            return this.nodes.contains(node1) && this.nodes.contains(node2);
        }
    //End Metodos publicos.
    
    //Metodos privados:
    //End Metodos privados.
        
    //Getters:
    //End Getters.
        
    //Setters:
    //End Setters.
    
}
