package chapter01.audience;

import chapter01.ticket.Invitation;
import chapter01.ticket.Ticket;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BagTest {
    private Bag bagWithInvitation;
    private Bag bagWithNoInvitation;

    @Before
    public void setUp() throws Exception {
        bagWithInvitation = new Bag(1000L, new Invitation());
        bagWithNoInvitation = new Bag(1000L);
    }

    @Test
    public void hasInvitation() {
        assertThat(bagWithNoInvitation.hasInvitation()).isFalse();
        assertThat(bagWithInvitation.hasInvitation()).isTrue();
    }

    @Test
    public void minusAmount() {
        Ticket ticket = new Ticket(1000L);
        bagWithNoInvitation.minusAmount(ticket.getFee());
        assertThat(bagWithNoInvitation.getAmount()).isEqualTo(0);
    }
}