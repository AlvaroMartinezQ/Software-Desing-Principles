package practica_3;

public class Main {
    public static void main(String[] args) {
        TicketToRide ticketToRide = new TicketToRide();
        // ticketToRide.loadAllMap(); // carga Europa 
        ticketToRide.loadIberianMap(); // carga peninsula Iberica

        //Metodo que resuelve Kruskal camino minimo
        ticketToRide.CalcMinSpanningTree();
        
        // Metodo que resuelve Kruskal (?) camino maximo
        // ticketToRide.CalcMaxSpanningTree();
    }
}
