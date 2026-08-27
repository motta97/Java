public class ClosedState implements IState{
    private Context context;
    public ClosedState(Context context){
        this.context= context;
    }
    public void open(){
        System.out.println("OPENING THE SYSTEM...");
        context.setState(new OpenState(context));
    }
    public void close(){
        System.out.println("THE SYSTEM IS ALREADY CLOSED");
    }
}