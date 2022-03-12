package practica_3;

import java.util.ArrayList;

public class Subset {

	// Atributos:
	private ArrayList<String> nodes;
	// End Atributos.

	// Constructores:
	public Subset() {
		this.nodes = new ArrayList<String>();
	}

	public Subset(Subset subset1, Subset subset2) {
		this();
		for (String node : subset1.nodes)
			this.nodes.add(node);
		for (String node : subset2.nodes)
			this.nodes.add(node);
	}
	// End Constructores.

	// Metodos publicos:
	public void addNode(String node) {
		this.nodes.add(node);
	}

	public boolean find(String node) {
		return this.nodes.contains(node);
	}

	public boolean findBoth(String node1, String node2) {
		return this.nodes.contains(node1) && this.nodes.contains(node2);
	}
	// End Metodos publicos.

	// Metodos privados:
	// End Metodos privados.

	// Getters:
	// End Getters.

	// Setters:
	// End Setters.
	@Override
	public String toString() {
		String s = "Subset: ";
		for (String st: this.nodes) {
			s += (st + "-");
		}
		return s;
	}
}
