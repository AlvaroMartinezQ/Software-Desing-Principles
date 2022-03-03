package mavenproject.practica_2;

public class Main {
    public static void main(String[] argv) {
        // 5 son las dimensiones del vector
        Vectores test_v = new Vectores(5);
        // Imprimimos para comprobar que todo esta en orden (que se ha ordenado aleatoriamente bien)
        test_v.imprime_vectores();
        Algor a = new Algor();
        System.out.println(
            a.exec_fuerza(test_v.get_vector_2())
        );
    }
}
