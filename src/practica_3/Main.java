package practica_3;

public class Main {
    public static void main(String[] args) {
        TicketToRide ticketToRide = new TicketToRide();
        // ticketToRide.LoadEuropeMap(); // carga Europa 
        ticketToRide.LoadIberianMap(); // carga peninsula Iberica

        //Metodo que resuelve Kruskal
        ticketToRide.CalcMinSpanningTree();
    }
}
