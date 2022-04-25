package practica_7.Decorator;

import java.io.*;

public class Test {
	public static void main(String[] args) {

		String fileDirection = "prueba.txt";
		String texto1 = "grupo de contrasenyas: 12334-123442-111233";
		String texto2 = "grupo de ID_local: 123-321-213";

		// Creamos o abrimos el archivo y escribimos:
		try {
			FileWriter fw = new FileWriter(fileDirection);
			BufferedWriter bw = new BufferedWriter(fw);
			CriptoWriter outCripted = new CriptoWriter(bw);

			System.out.println("1.Se escribe de forma encripatada la siguiente frase:");
			System.out.println(texto1);
			outCripted.write(texto1);
			outCripted.write("\n");
			System.out.println();

			outCripted.close();

			// Actualizamos el buffer para que concatene:
			bw = new BufferedWriter(new FileWriter(fileDirection, true));
			outCripted = new CriptoWriter(bw);

			System.out.println("2. Se escribe de forma encriptada la siguiente frase:");
			System.out.println(texto2);
			outCripted.write(texto2);
			System.out.println();

			outCripted.close();

		} catch (IOException iOException) {
			System.out.println("Excepcion de E/S: " + iOException);
		}

		// lectura de fichero
		String texto = new String();
		String textoEncript = new String();

		try {

			// Leemos sin descifrar:
			FileReader fr = new FileReader(fileDirection);
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			while ((s = entrada.readLine()) != null) {
				texto += s;
			}
			entrada.close();

			// Leemos el texto descifrado:
			fr = new FileReader(fileDirection);
			CriptoReader inCripted = new CriptoReader(fr);
			char c;

			while ((c = (char) inCripted.read()) != '\ufffe') {
				textoEncript += c;
			}

			inCripted.close();

		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Archivo no encontrado: " + fileNotFoundException);
		} catch (IOException iOException) {
			System.out.println("Excepcion de E/S: " + iOException);
		}

		// Por ultimo vemos los textos:

		System.out.println("-----------------------------------------------------------");
		System.out.println();
		System.out.println("Textos originales: ");
		System.out.println(texto1);
		System.out.println(texto2);
		System.out.println();
		System.out.println("Textos Sin descifrar:");
		System.out.println(texto);
		System.out.println("Texto descifrado:");
		System.out.println(textoEncript);
	}
}
