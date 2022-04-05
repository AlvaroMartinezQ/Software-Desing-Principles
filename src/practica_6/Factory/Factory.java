package practica_6.Factory;

public abstract class Factory {
	abstract Ordenacion createOrden(String item);

	public Ordenacion ordena(String type) {
		Ordenacion orden = createOrden(type);
		orden.ordena();
		return orden;
	}

	public Ordenacion imprime(String type) {
		Ordenacion orden = createOrden(type);
		orden.imprime();
		return orden;
	}
}
