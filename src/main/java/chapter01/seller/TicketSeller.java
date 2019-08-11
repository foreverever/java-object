package chapter01.seller;

import chapter01.audience.Audience;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {
        Long payment = audience.buy(ticketOffice.getTicket());
        ticketOffice.plusAmount(payment);

        System.out.println("티켓 판매 완료!");
        System.out.println("남은 티켓 개수 : " + ticketOffice.remainderTicket());
    }
}
