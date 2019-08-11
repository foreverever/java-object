package chapter01.audience;

import chapter01.ticket.Ticket;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket) {
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
        }
        return ticket.getFee();
    }
}
