package week7.exercises.sync_exercise;

public class TicketTest {

    public static void main(String[] args) {
        Ticket ticket = new Ticket(1);

        TicketSeller ticketSeller1 = new TicketSeller(ticket);
        TicketSeller ticketSeller2 = new TicketSeller(ticket);
        TicketSeller ticketSeller3 = new TicketSeller(ticket);
        TicketSeller ticketSeller4 = new TicketSeller(ticket);

        ticketSeller1.start();
        ticketSeller2.start();
        ticketSeller3.start();
        ticketSeller4.start();
    }
}
