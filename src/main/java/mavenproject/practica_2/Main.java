package mavenproject.practica_2;

public class Main {
    public static void main(String[] argv) {
        Vectores test_v = new Vectores(5);
        test_v.imprime_vectores();
        Algor a = new Algor();
        System.out.println(
            a.exec_fuerza(test_v.get_vector_2())
        );
    }
}
