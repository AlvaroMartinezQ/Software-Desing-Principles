package practica_7.Facade;

public class ImprimeClass implements Imprime {

	private String texto;

	@Override
	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public void imprimirDocumento() {
		System.out.println("Texto: " + texto);
	}
}
