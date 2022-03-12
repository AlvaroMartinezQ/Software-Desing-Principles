package practica_3;

import java.util.ArrayList;

public class TicketToRide {

	// Atributos:
	private ArrayList<Edge> edges;
	private ArrayList<String> nodes;
	// End Atributos.

	// Constructores:
	public TicketToRide() {
		this.edges = new ArrayList<Edge>();
		this.nodes = new ArrayList<String>();
	}
	// End Constructores.

	// Metodos publicos:
	public void LoadIberianMap() {
		// Creacion de los nodos
		this.edges.add(new Edge("Madrid", "Lisboa", 3));
		this.edges.add(new Edge("Madrid", "Cadiz", 3));
		this.edges.add(new Edge("Madrid", "Barcelona", 2));
		this.edges.add(new Edge("Madrid", "Pamplona", 6));
		this.edges.add(new Edge("Lisboa", "Cadiz", 2));
		this.edges.add(new Edge("Barcelona", "Pamplona", 4));
		// Carga de los nombres de los nodos
		this.fillNodes();
	}

	public void LoadAllMap() {
		// TODO: load the whole map
	}
	
	public void CalcMinSpanningTree() {
		// 1º Ordenamos los candidatos del problema
		// de coste menor a coste mayor
		ArrayList<Edge> nodeList = this.orderNodes(true);
		System.out.println("INITIAL ORDERED NODES KRUSKAL: " + this.nodes.size());
		for (Edge e: nodeList) {
			System.out.println(e.getSource() + "-" + e.getDestination() + ": " + e.getLength());
		}
		
		// 2º Seleccionamos el nodo de menor coste, en
		// este caso el 0
		
		
		// 3º Comprobamos si incluir ese nodo en la
		// solucion genera o no un bucle en el arbol solucion
		
		
		// 4º Si no lo genera (el bulce) lo incluimos
		// en la solucion, en otro caso se descarta
		
		// 5º Repetimos la iteracion si el numero de nodos
		// incluidos en la solucion es igual al numero de nodos iniciales
	}

	public void CalcMaxSpanningTree() {

	}
	
	// End Metodos publicos.

	// Metodos privados:
	
	private void fillNodes() {
		for (Edge edge : this.edges) {
			if (!this.nodes.contains(edge.getSource())) {
				this.nodes.add(edge.getSource());
			}
			if (!this.nodes.contains(edge.getDestination())) {
				this.nodes.add(edge.getDestination());
			}
		}
		System.out.println("INITIAL NODES: " + this.nodes.size());
		for (Edge e: this.edges) {
			System.out.println(e.getSource() + "-" + e.getDestination() + ": " + e.getLength());
		}
		System.out.println();
	}
	
	private ArrayList<Edge> orderNodes(boolean minToMax) {
		ArrayList<Edge> nodeList = new ArrayList<Edge>();
			
		for (int i = 0; i < this.edges.size(); i++) {
			for (Edge e: this.edges) {
				if (i == e.getLength() && !nodeList.contains(e)) {
					if (minToMax) {
						nodeList.add(e);
					} else {
						nodeList.add(0, e);
					}
				}
			}
		}
		
		return nodeList;
	}
	
	// End Metodos privados.

	// Getters:
	public ArrayList<Edge> getEdges() {
		return this.edges;
	}

	public ArrayList<String> getNodes() {
		return this.nodes;
	}
	// End Getters.

	// Setters:
	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}

	public void setNodes(ArrayList<String> nodes) {
		this.nodes = nodes;
	}
	// End Setters.
}
