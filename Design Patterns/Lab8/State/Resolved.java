
public class Resolved implements TicketState {

    @Override
    public void assign(SupportTicket ticket) {
        System.out.println("Ticket is already assigned");
    }

    @Override
    public void resolve(SupportTicket ticket) {
        System.out.println("Ticket is already being resolved");
    }

    @Override
    public void close(SupportTicket ticket) {
        System.out.println("Closing the ticket. Moving to CLOSED state");
        ticket.setState(new Closed());
    }

    @Override
    public void reopen(SupportTicket ticket) {
        System.out.println("Reopening the ticket. Moving to the IN_PROGRESS State");
        ticket.setState(new InProgressState());
    }
    
}
