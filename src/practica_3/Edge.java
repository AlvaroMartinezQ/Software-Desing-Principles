package practica_3;

public class Edge {

	// Atributos:
	private String source;
	private String destination;
	private int length;
	// End Atributos.

	// Constructores:
	public Edge() {
		this.source = "";
		this.setDestination("");
		this.setLength(0);
	}

	public Edge(String source, String destination, int length) {
		this.setSource(source);
		this.setDestination(destination);
		this.setLength(length);
	}
	// End Constructores.

	// Metodos publicos:
	// End Metodos publicos.

	// Metodos privados:
	// End Metodos privados.

	// Getters:
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}
	// End Getters.

	// Setters:
	public void setSource(String source) {
		this.source = source;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	// End Setters.
}
