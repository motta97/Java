/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author youss
 */
public class SupportTicket {
    private TicketState state;

    public SupportTicket() {
        state = new OpenState();
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public void assign() {
        state.assign(this);
    }

    public void resolve() {
        state.resolve(this);
    }

    public void close() {
        state.close(this);
    }

    public void reopen() {
        state.reopen(this);
    }

    public TicketState getState() {
        return state;
    }
}

