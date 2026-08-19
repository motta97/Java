public class InProgressState implements TicketState {

    @Override
    public void assign(SupportTicket ticket) {
        System.out.println("Ticket can't be assigned at the moment");

    }

    @Override
    public void resolve(SupportTicket ticket) {
        System.out.println("Ticket is resolved, Moving to RESOLVED state");
        ticket.setState(new Resolved());
    }

    @Override
    public void close(SupportTicket ticket) {
        System.out.println("Ticket can't be closed at the momemnt");
    }

    @Override
    public void reopen(SupportTicket ticket) {
        System.out.println("Ticket can't be reopened at the moment");
    }
    
}
