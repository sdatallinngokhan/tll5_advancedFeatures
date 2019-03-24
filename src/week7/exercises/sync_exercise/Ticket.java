package week7.exercises.sync_exercise;

public class Ticket {

    private int ticketCount;

    public Ticket(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public synchronized void sellTicket() {
        if (ticketCount > 0) {
            System.out.println("Taking a ticket.");
            ticketCount--;
            System.out.println("You bought a ticket. Remained ticket : " + ticketCount);
        } else {
            System.out.println("Tickets are sold out.");
        }
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }
}
