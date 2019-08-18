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

    //2차 개선(audience에게 책임 위임)
    //4차 개선(ticketOffice에게 책임 위임)
    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);

        System.out.println("티켓 판매 완료!");
        System.out.println("남은 티켓 개수 : " + ticketOffice.remainderTicket());
    }
}
