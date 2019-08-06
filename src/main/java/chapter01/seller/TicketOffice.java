package chapter01.seller;

import chapter01.ticket.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = 0L;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public TicketOffice(Long amount, List<Ticket> tickets) {
        this.amount = amount;
        this.tickets = tickets;
    }

    public Long getAmount() {
        return amount;
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public int remainderTicket() {
        return tickets.size();
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }
}
