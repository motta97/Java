public class Main{
    public static void main(String[] args) {
        SupportTicket ticket = new SupportTicket();
        ticket.setState(new OpenState());
        ticket.assign();
        ticket.resolve();
        ticket.resolve();
        ticket.reopen();
        ticket.reopen();
        ticket.resolve();
        ticket.close();
        ticket.reopen();
        ticket.resolve();
        ticket.close();
        ticket.assign();
    }
}