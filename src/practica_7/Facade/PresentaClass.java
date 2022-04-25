package practica_7.Facade;

public class PresentaClass implements Presenta {

	@Override
	public void setOrdena(boolean orden) {
		System.out.println("Orden: " + orden);
	}

	@Override
	public void setGrapa(boolean grapado) {
		System.out.println("Grapado: " + grapado);
	}

}
