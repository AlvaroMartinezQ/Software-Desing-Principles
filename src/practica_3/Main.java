package practica_3;

public class Main {
    public static void main(String[] args) {
        TicketToRide ticketToRide = new TicketToRide();
         
        ticketToRide.loadIberianMap(); // carga peninsula Iberica
        ticketToRide.calcMinSpanningTree();
        ticketToRide.calcMaxSpanningTree();
        
        ticketToRide.loadAllMap(); // carga Europa
        ticketToRide.calcMinSpanningTree();
        ticketToRide.calcMaxSpanningTree();
    }
}
