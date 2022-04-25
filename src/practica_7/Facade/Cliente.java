package practica_7.Facade;

public class Cliente {
	public static void main(String[] args) {

		Fachada fachada = new Fachada();

		fachada.imprimeLujo("ESTO ES DE LUJO");
		System.out.println("------------------------------");
		fachada.imprimeBorrador("ESTO ES UN BORRADOR");
		System.out.println("------------------------------");
		fachada.getIImprime().setTexto("ESTO ES UN TEXTO");
		fachada.getIPresenta().setGrapa(true);
		fachada.getIConfigura().setTipoHoja("A3");
		System.out.println("------------------------------");
	}
}
