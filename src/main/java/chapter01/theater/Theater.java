package chapter01.theater;

import chapter01.audience.Audience;
import chapter01.seller.TicketSeller;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    //1차 개선(ticketSeller에게 책임 위임)
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
