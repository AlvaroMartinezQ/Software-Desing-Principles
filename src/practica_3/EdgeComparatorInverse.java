/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_3;

/**
 *
 * @author sebss
 */
import java.util.Comparator;

public class EdgeComparatorInverse implements Comparator<Edge> {

	// Atributos:
	// End Atributos.

	// Constructores:
	// End Constructores.

	// Metodos publicos:
	
	// Comparacion de costes
	@Override
	public int compare(Edge edge1, Edge edge2) {
		if (edge1.getLength() == edge2.getLength())
			return 0;
		else if (edge1.getLength() < edge2.getLength())
			return 1;
		else
			return -1;
	}
	// End Metodos publicos.

	// Metodos privados:
	// End Metodos privados.

	// Getters:
	// End Getters.

	// Setters:
	// End Setters.
}
