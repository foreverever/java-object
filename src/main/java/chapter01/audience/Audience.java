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
    
    //3차 개선 (bag에게 책임 위임)
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
