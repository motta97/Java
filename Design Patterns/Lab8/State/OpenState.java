/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author youss
 */
public class OpenState implements TicketState {

    @Override
    public void assign(SupportTicket ticket) {
        System.out.println("Ticket assigned. Moving to IN_PROGRESS.");
        ticket.setState(new InProgressState());
    }

    @Override
    public void resolve(SupportTicket ticket) {
        System.out.println("Ticket must be assigned before it can be resolved.");
    }

    @Override
    public void close(SupportTicket ticket) {
        System.out.println("Open ticket cannot be closed.");
    }

    @Override
    public void reopen(SupportTicket ticket) {
        System.out.println("Ticket is already open.");
    }
    
}
