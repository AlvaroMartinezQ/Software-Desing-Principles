package practica_3;

import java.util.ArrayList;

public class SubsetsManager {

	// Atributos:
	private ArrayList<Subset> subsets;
	// End Atributos.

	// Constructores:
	public SubsetsManager() {
		this.subsets = new ArrayList<Subset>();
	}

	public SubsetsManager(ArrayList<String> nodes) {
		this();
		for (String node : nodes) {
			Subset subset = new Subset();
			subset.AddNode(node);
			this.subsets.add(subset);
		}
	}
	// End Constructores.

	// Metodos publicos:
	public boolean FindSourceAndDestinationInSubsets(Edge edge) {
		for (Subset subset : this.subsets)
			if (subset.FindBoth(edge.getSource(), edge.getDestination()))
				return true;
		return false;
	}

	public void UpdateSubsetsWithEdge(Edge edge) {
		Subset sourceSubset = this.findSubsetOf(edge.getSource());
		Subset destinationSubset = this.findSubsetOf(edge.getDestination());
		Subset union = new Subset(sourceSubset, destinationSubset);
		this.subsets.add(union);
		this.subsets.remove(sourceSubset);
		this.subsets.remove(destinationSubset);
	}

	// End Metodos publicos.

	// Metodos privados:
	private Subset findSubsetOf(String node) {
		for (Subset subset : this.subsets)
			if (subset.Find(node))
				return subset;
		return new Subset();
	}
	// End Metodos privados.

	// Getters:
	// End Getters.

	// Setters:
	// End Setters.

}
