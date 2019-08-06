package chapter01;

import chapter01.audience.Audience;
import chapter01.audience.Bag;
import chapter01.seller.TicketOffice;
import chapter01.seller.TicketSeller;
import chapter01.theater.Theater;
import chapter01.ticket.Ticket;

public class Main {
    public static void main(String[] args) {
        TicketSeller ticketSeller = new TicketSeller(new TicketOffice(0L, new Ticket(100L), new Ticket(100L)));
        Theater theater = new Theater(ticketSeller);
        theater.enter(new Audience(new Bag(1000L)));
    }
}