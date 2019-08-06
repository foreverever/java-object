package chapter01.seller;

import chapter01.ticket.Ticket;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TicketOfficeTest {
    private List<Ticket> tickets;
    private TicketOffice ticketOffice;

    @Before
    public void setUp() throws Exception {
        tickets = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            tickets.add(new Ticket(1000L));
        }
        ticketOffice = new TicketOffice(0L, tickets);
    }

    @Test
    public void getTicket() {
        Ticket ticket = tickets.remove(0);
        assertThat(tickets.size()).isEqualTo(9);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getAfterRemoveTicket() {
        tickets.remove(0);
        tickets.get(9);
    }

    @Test
    public void plusAmount() {
        ticketOffice.plusAmount(1000L);
        assertThat(ticketOffice.getAmount()).isEqualTo(1000L);
    }
}