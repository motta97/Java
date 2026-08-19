public interface TicketState{
    void assign(SupportTicket ticket);
    void resolve(SupportTicket ticket);
    void close(SupportTicket ticket);
    void reopen(SupportTicket ticket);
}