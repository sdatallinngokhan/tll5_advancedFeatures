package week7.exercises.sync_exercise;

public class TicketSeller extends Thread {

    private Ticket ticket;

    public TicketSeller(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.sellTicket();
    }
}
