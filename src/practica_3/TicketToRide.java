package trabajofds3;

import java.util.ArrayList;

public class TicketToRide {
    
    //Atributos:
        private ArrayList<Edge> edges;
        private ArrayList<String> nodes;
    //End Atributos.
    
    //Constructores:
        public TicketToRide() {
            this.edges = new ArrayList<Edge>();
            this.nodes = new ArrayList<String>();
        }
    //End Constructores.
    
    //Metodos publicos:
        public void CalcMinSpanningTree(){
            
        }
        public void CalcMaxSpanningTree(){
            
        }
        public void LoadIberianMap(){
            this.edges.add(new Edge("Madrid", "Lisboa", 3));
            this.edges.add(new Edge("Madrid", "Cádiz", 3));
            this.edges.add(new Edge("Madrid", "Barcelona", 2));
            this.edges.add(new Edge("Madrid", "Pamplona", 6));
            this.edges.add(new Edge("Lisboa", "Cádiz", 2));
            this.edges.add(new Edge("Barcelona", "Pamplona", 4));
            this.fillNodes();
        }
        public void LoadAllMap(){
            
        }
    //End Metodos publicos.
    
    //Metodos privados:
        private void fillNodes() {
            for (Edge edge : this.edges) {
                if (!this.nodes.contains(edge.getSource())) {
                this.nodes.add(edge.getSource());
                }
                if (!this.nodes.contains(edge.getDestination())) {
                    this.nodes.add(edge.getDestination());
                }
            }
            System.out.println("NODES: " + this.nodes.size());
        }
    //End Metodos privados.
        
    //Getters:
        public ArrayList<Edge> getEdges(){return this.edges;}
        public ArrayList<String> getNodes(){return this.nodes;}
    //End Getters.
        
    //Setters:
        public void setEdges(ArrayList<Edge> edges){this.edges = edges;}
        public void setNodes(ArrayList<String> nodes){this.nodes = nodes;}
    //End Setters.
}
