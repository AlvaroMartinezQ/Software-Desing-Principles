package practica_3;

public class Main {
    public static void main(String[] args) {
        TicketToRide ticketToRide = new TicketToRide();
        // o ticketToRide.LoadEuropeMap(); para el grafo completo
        ticketToRide.LoadIberianMap();

        //Metodo que resuelve Kruskal
        ticketToRide.CalcMinSpanningTree();
    }
}
