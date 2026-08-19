
public class Closed implements TicketState {

    @Override
    public void assign(SupportTicket ticket) {
        System.out.println("Ticket can't be assigned, it's closed");
    }

    @Override
    public void resolve(SupportTicket ticket) {
        System.out.println("Ticket can't be resolved, it's closed");
    }

    @Override
    public void close(SupportTicket ticket) {
        System.out.println("Ticket is already closed");
    }

    @Override
    public void reopen(SupportTicket ticket) {
        System.out.println("Ticket Ropened, moved to IN_PROGRESS State");
        ticket.setState(new InProgressState());
    }
    
}
