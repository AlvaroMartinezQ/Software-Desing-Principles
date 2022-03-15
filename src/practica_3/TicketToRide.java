package practica_3;

import java.util.ArrayList;
import java.util.Collections;

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
	public void calcMinSpanningTree() {
		int nodesToFill = this.nodes.size();
		System.out.println("\n--> INITIAL MIN TO MAX NODES KRUSKAL: " + nodesToFill);

		// Pre-inicio: Creamos el subset
		// En este momento cada set del subset sera de solo 1 elemento
		SubsetsManager sbm = new SubsetsManager(this.nodes);
		// System.out.println(sbm.toString()); // Para comprobar los subsets

		// Primero Ordenamos los candidatos del problema
		// de coste menor a coste mayor
		ArrayList<Edge> temp_edges = this.edges;
		Collections.sort(temp_edges, new EdgeComparator());

		// Para comprobar la ordenacion de nodos
		/*
		 * for (Edge e: nodeList) { System.out.println(e.getSource() + "-" +
		 * e.getDestination() + ": " + e.getLength()); } System.out.println();
		 */

		int actualEdge = 0;
		int totalCost = 0;
		int totalEdges = 0;

		// Repetimos la iteracion si el numero de aristas
		// incluidos en la solucion es menor al numero de nodos - 1
		while (totalEdges < nodesToFill - 1 && // mientras no haya incluido ya todos los nodos
				actualEdge < temp_edges.size() // mientras me queden nodos
		) {
			// Seleccionamos el nodo actual sobre el que operar
			Edge e = temp_edges.get(actualEdge);

			// Comprobamos si incluir ese nodo en la solucion
			// genera o no un bucle en el arbol solucion
			if (!sbm.findSourceAndDestinationInSubsets(e)) {
				// Si no hay ningun subset que contenga
				// el destino y el origen, el nodo es valido
				System.out.println("Incluyendo nodo: " + e.getSource() + "-" + e.getDestination() + " con coste: "
						+ e.getLength() + " en la solución");
				sbm.updateSubsetsWithEdge(e);
				totalEdges++;
				totalCost += e.getLength();
			} else {
				System.out.println("No incluyendo nodo: " + e.getSource() + "-" + e.getDestination() + " con coste: "
						+ e.getLength() + " no es factible para la solución, genera un bucle en el grafo");
			}
			actualEdge++;
		}

		System.out.println("\n" + sbm.toString() + "Coste: " + totalCost); // Imprimimos los subsets
	}

	public void calcMaxSpanningTree() {
		int nodesToFill = this.nodes.size();
		System.out.println("\n--> INITIAL MAX TO MIN NODES KRUSKAL: " + nodesToFill);

		// Pre-inicio: Creamos el subset
		// En este momento cada set del subset sera de solo 1 elemento
		SubsetsManager sbm = new SubsetsManager(this.nodes);
		// System.out.println(sbm.toString()); // Para comprobar los subsets

		// Primero Ordenamos los candidatos del problema
		// de coste mayor a menor coste
		ArrayList<Edge> temp_edges = this.edges;
		Collections.sort(temp_edges, new EdgeComparatorInverse());

		// Para comprobar la ordenacion de nodos
		/*
		 * for (Edge e: nodeList) { System.out.println(e.getSource() + "-" +
		 * e.getDestination() + ": " + e.getLength()); } System.out.println();
		 */

		int actualEdge = 0;
		int totalCost = 0;
		int totalEdges = 0;

		// Repetimos la iteracion si el numero de aristas
		// incluidos en la solucion es menor al numero de nodos - 1
		while (totalEdges < nodesToFill - 1 && // mientras no haya incluido ya todos los nodos
				actualEdge < temp_edges.size() // mientras me queden nodos
		) {
			// Seleccionamos el nodo actual sobre el que operar
			Edge e = temp_edges.get(actualEdge);

			// Comprobamos si incluir ese nodo en la solucion
			// genera o no un bucle en el arbol solucion
			if (!sbm.findSourceAndDestinationInSubsets(e)) {
				// Si no hay ningun subset que contenga
				// el destino y el origen, el nodo es valido
				System.out.println("Incluyendo nodo: " + e.getSource() + "-" + e.getDestination() + " con coste: "
						+ e.getLength() + " en la solución");
				sbm.updateSubsetsWithEdge(e);
				totalEdges++;
				totalCost += e.getLength();
			} else {
				System.out.println("No incluyendo nodo: " + e.getSource() + "-" + e.getDestination() + " con coste: "
						+ e.getLength() + " no es factible para la solución, genera un bucle en el grafo");
			}
			actualEdge++;
		}

		System.out.println("\n" + sbm.toString() + "Coste: " + totalCost); // Imprimimos los subsets
	}

	public void loadIberianMap() {
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

	public void loadAllMap() {
		// Creacion de los nodos
		this.edges.add(new Edge("Madrid", "Lisboa", 3));
		this.edges.add(new Edge("Madrid", "Cadiz", 3));
		this.edges.add(new Edge("Madrid", "Barcelona", 2));
		this.edges.add(new Edge("Madrid", "Pamplona", 6));
		this.edges.add(new Edge("Lisboa", "Cadiz", 2));
		this.edges.add(new Edge("Barcelona", "Pamplona", 4));
		this.edges.add(new Edge("Barcelona", "Marsella", 4));
		this.edges.add(new Edge("Pamplona", "Paris", 4));
		this.edges.add(new Edge("Pamplona", "Brest", 4));
		this.edges.add(new Edge("Paris", "Zurich", 6));
		this.edges.add(new Edge("Paris", "Frankfurt", 3));
		this.edges.add(new Edge("Paris", "Bruselas", 2));
		this.edges.add(new Edge("Paris", "Dieppe", 1));
		this.edges.add(new Edge("Paris", "Brest", 3));
		this.edges.add(new Edge("Zurich", "Marsella", 4));
		this.edges.add(new Edge("Zurich", "Venecia", 4));
		this.edges.add(new Edge("Zurich", "Munich", 4));
		this.edges.add(new Edge("Marsella", "Roma", 8));
		this.edges.add(new Edge("Roma", "Venecia", 2));
		this.edges.add(new Edge("Roma", "Brindisi", 2));
		this.edges.add(new Edge("Roma", "Palermo", 4));
		this.edges.add(new Edge("Venecia", "Zagreb", 2));
		this.edges.add(new Edge("Venecia", "Munich", 4));
		this.edges.add(new Edge("Zagreb", "Sarajevo", 3));
		this.edges.add(new Edge("Zagreb", "Budapest", 2));
		this.edges.add(new Edge("Zagreb", "Viena", 2));
		this.edges.add(new Edge("Brindisi", "Palermo", 3));
		this.edges.add(new Edge("Brindisi", "Atenas", 4));
		this.edges.add(new Edge("Palermo", "Esmirna", 6));
		this.edges.add(new Edge("Sarajevo", "Budapest", 3));
		this.edges.add(new Edge("Sarajevo", "Atenas", 4));
		this.edges.add(new Edge("Sarajevo", "Sofia", 4));
		this.edges.add(new Edge("Budapest", "Bucarest", 8));
		this.edges.add(new Edge("Budapest", "Kiev", 12));
		this.edges.add(new Edge("Budapest", "Viena", 1));
		this.edges.add(new Edge("Atenas", "Sofia", 3));
		this.edges.add(new Edge("Atenas", "Esmirna", 2));
		this.edges.add(new Edge("Sofia", "Bucarest", 4));
		this.edges.add(new Edge("Sofia", "Estambul", 3));
		this.edges.add(new Edge("Bucarest", "Sebastopol", 4));
		this.edges.add(new Edge("Bucarest", "Estambul", 3));
		this.edges.add(new Edge("Bucarest", "Kiev", 4));
		this.edges.add(new Edge("Sebastopol", "Estambul", 4));
		this.edges.add(new Edge("Sebastopol", "Erzurum", 4));
		this.edges.add(new Edge("Sebastopol", "Sochi", 2));
		this.edges.add(new Edge("Sebastopol", "Rostov", 4));
		this.edges.add(new Edge("Estambul", "Ankara", 4));
		this.edges.add(new Edge("Estambul", "Esmirna", 4));
		this.edges.add(new Edge("Ankara", "Esmirna", 6));
		this.edges.add(new Edge("Ankara", "Erzurum", 3));
		this.edges.add(new Edge("Erzurum", "Sochi", 6));
		this.edges.add(new Edge("Sochi", "Rostov", 2));
		this.edges.add(new Edge("Rostov", "Jarkov", 2));
		this.edges.add(new Edge("Jarkov", "Kiev", 4));
		this.edges.add(new Edge("Kiev", "Smolensk", 3));
		this.edges.add(new Edge("Kiev", "Vilna", 2));
		this.edges.add(new Edge("Kiev", "Varsovia", 4));
		this.edges.add(new Edge("Smolensk", "Moscu", 2));
		this.edges.add(new Edge("Smolensk", "Vilna", 3));
		this.edges.add(new Edge("Moscu", "San Petersburgo", 4));
		this.edges.add(new Edge("Vilna", "Varsovia", 3));
		this.edges.add(new Edge("Vilna", "San Petersburgo", 4));
		this.edges.add(new Edge("Vilna", "Riga", 4));
		this.edges.add(new Edge("Varsovia", "Danzig", 2));
		this.edges.add(new Edge("Varsovia", "Viena", 4));
		this.edges.add(new Edge("Varsovia", "Berlin", 4));
		this.edges.add(new Edge("San Petersburgo", "Riga", 4));
		this.edges.add(new Edge("San Petersburgo", "Estocolmo", 16));
		this.edges.add(new Edge("Riga", "Danzig", 3));
		this.edges.add(new Edge("Estocolmo", "Copenhague", 3));
		this.edges.add(new Edge("Danzig", "Berlin", 4));
		this.edges.add(new Edge("Viena", "Munich", 3));
		this.edges.add(new Edge("Viena", "Berlin", 3));
		this.edges.add(new Edge("Munich", "Frankfurt", 2));
		this.edges.add(new Edge("Berlin", "Frankfurt", 3));
		this.edges.add(new Edge("Berlin", "Essen", 2));
		this.edges.add(new Edge("Frankfurt", "Essen", 2));
		this.edges.add(new Edge("Frankfurt", "Amsterdan", 2));
		this.edges.add(new Edge("Frankfurt", "Bruselas", 2));
		this.edges.add(new Edge("Essen", "Copenhague", 3));
		this.edges.add(new Edge("Essen", "Amsterdan", 3));
		this.edges.add(new Edge("Amsterdan", "Bruselas", 1));
		this.edges.add(new Edge("Amsterdan", "Londres", 2));
		this.edges.add(new Edge("Bruselas", "Dieppe", 2));
		this.edges.add(new Edge("Londres", "Edimburgo", 4));
		this.edges.add(new Edge("Londres", "Dieppe", 2));
		this.edges.add(new Edge("Dieppe", "Brest", 2));
		// Carga de los nombres de los nodos
		this.fillNodes();
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
		for (Edge e : this.edges) {
			System.out.println(e.getSource() + "-" + e.getDestination() + ": " + e.getLength());
		}
		System.out.println();
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
