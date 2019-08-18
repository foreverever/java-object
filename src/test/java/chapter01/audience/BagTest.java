package chapter01.audience;

import chapter01.ticket.Invitation;
import chapter01.ticket.Ticket;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BagTest {
    private Bag bagWithInvitation;
    private Bag bagWithNoInvitation;
    private Ticket ticket;

    @Before
    public void setUp() throws Exception {
        bagWithInvitation = new Bag(1000L, new Invitation());
        bagWithNoInvitation = new Bag(1000L);
        ticket = new Ticket(1000L);
    }

    @Test
    public void hasInvitation() {
        assertThat(bagWithNoInvitation.hasInvitation()).isFalse();
        assertThat(bagWithInvitation.hasInvitation()).isTrue();
    }

    @Test
    public void minusAmount() {
        bagWithNoInvitation.minusAmount(ticket.getFee());
        assertThat(bagWithNoInvitation.getAmount()).isEqualTo(0);
    }

    @Test
    public void hold() {
        assertThat(bagWithNoInvitation.hold(ticket)).isEqualTo(1000L);
        assertThat(bagWithInvitation.hold(ticket)).isEqualTo(0L);
    }
}