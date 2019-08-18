package chapter01.audience;

import chapter01.ticket.Invitation;
import chapter01.ticket.Ticket;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Long getAmount() {
        return amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public void minusAmount(Long fee) {
        this.amount -= fee;
    }

    public Long hold(Ticket ticket) {
        this.ticket = ticket;
        if (hasInvitation()) return 0L;

        minusAmount(ticket.getFee());
        return ticket.getFee();
    }
}
