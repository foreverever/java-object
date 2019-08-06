package chapter01.theater;

import chapter01.audience.Audience;
import chapter01.seller.TicketSeller;
import chapter01.ticket.Ticket;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    //절차 지향적
    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
        System.out.println("티켓 판매 완료!");
        System.out.println("남은 티켓 개수 : " + ticketSeller.getTicketOffice().remainderTicket());
    }
}
