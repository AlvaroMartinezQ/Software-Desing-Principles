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
		int nodesToFill = this.nodes.size();
		System.out.println("--> INITIAL MIN TO MAX NODES KRUSKAL: " + nodesToFill);
		
		// Pre-inicio: Creamos el subset
		// En este momento cada set del subset sera de solo 1 elemento
		SubsetsManager sbm = new SubsetsManager(this.nodes);
		System.out.println(sbm.toString()); // Comprobamos los subsets
		
		// 1º Ordenamos los candidatos del problema
		// de coste menor a coste mayor
		ArrayList<Edge> nodeList = this.orderNodes(true);
		
		for (Edge e: nodeList) {
			System.out.println(e.getSource() + "-" + e.getDestination() + ": " + e.getLength());
		}
		System.out.println();
		
		int actualEdge = 0;
		int totalCost = 0;
		int totalEdges = 0;
		
		// Repetimos la iteracion si el numero de aristas
		// incluidos en la solucion es menor al numero de nodos - 1
		while (totalEdges < nodesToFill - 1) {
			// Seleccionamos el nodo de menor coste, en
			// este caso el 0 ya que estan ordenados
			Edge e = nodeList.get(actualEdge);
			
			// Comprobamos si incluir ese nodo en la solucion
			// genera o no un bucle en el arbol solucion
			if (!sbm.FindSourceAndDestinationInSubsets(e)) {
				// Si no hay ningun subset que contenga
				// el destino y el origen, el nodo es valido
				sbm.UpdateSubsetsWithEdge(e);
				totalEdges++;
				totalCost += e.getLength();
			}
			actualEdge++;
		}
		System.out.println(sbm.toString() + "Coste: " + totalCost); // Imprimimos los subsets
	}

	public void CalcMaxSpanningTree() {
		ArrayList<Edge> nodeList = this.orderNodes(false);
		System.out.println("--> INITIAL MAX TO MIN NODES KRUSKAL: " + this.nodes.size());
		for (Edge e: nodeList) {
			System.out.println(e.getSource() + "-" + e.getDestination() + ": " + e.getLength());
		}
		System.out.println();
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
		System.out.println("--> INITIAL NON ORDERED NODES: " + this.nodes.size());
		for (Edge e: this.edges) {
			System.out.println(e.getSource() + "-" + e.getDestination() + ": " + e.getLength());
		}
		System.out.println();
	}
	
	private ArrayList<Edge> orderNodes(boolean minToMax) {
		ArrayList<Edge> nodeList = new ArrayList<Edge>();
		// EdgeComparator ec = new EdgeComparator();
			
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
