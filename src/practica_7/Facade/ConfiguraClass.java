package practica_7.Facade;

public class ConfiguraClass implements Configura {

	@Override
	public void setTipoHoja(String tipoHoja) {
		System.out.println("Tipo de hoja:  " + tipoHoja);
	}

	@Override
	public void setColor(boolean color) {
		System.out.println("Color: " + color);
	}

	@Override
	public void setBorrador(boolean borrador) {
		System.out.println("Borrador: " + borrador);
	}

}
