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

    public Invitation getInvitation() {
        return invitation;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public void minusAmount(Long fee) {
        this.amount -= fee;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            this.ticket = ticket;
            return 0L;
        }
        this.ticket = ticket;
        minusAmount(ticket.getFee());
        return ticket.getFee();
    }
}
