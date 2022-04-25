package practica_7.Facade;

public class Fachada {

	private Configura IConfigura;
	private Presenta IPresenta;
	private Imprime IImprime;

	public Fachada() {
		this.IConfigura = new ConfiguraClass();
		this.IPresenta = new PresentaClass();
		this.IImprime = new ImprimeClass();
	}

	public void imprimeLujo(String texto) {
		IConfigura.setTipoHoja("A4");
		IConfigura.setColor(true);
		IPresenta.setOrdena(true);
		IPresenta.setGrapa(true);
		IImprime.setTexto(texto);
		IImprime.imprimirDocumento();
	}

	public void imprimeBorrador(String texto) {
		IConfigura.setTipoHoja("B5");
		IConfigura.setColor(false);
		IConfigura.setBorrador(true);
		IImprime.setTexto(texto);
		IImprime.imprimirDocumento();
	}

	public Configura getIConfigura() {
		return IConfigura;
	}

	public void setIConfigura(Configura IConfigura) {
		this.IConfigura = IConfigura;
	}

	public Presenta getIPresenta() {
		return IPresenta;
	}

	public void setIPresenta(Presenta IPresenta) {
		this.IPresenta = IPresenta;
	}

	public Imprime getIImprime() {
		return IImprime;
	}

	public void setIImprime(Imprime IImprime) {
		this.IImprime = IImprime;
	}

}
