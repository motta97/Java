public class OpenState implements IState{
    private Context context;
    public OpenState(Context context){
        this.context=context;
    }

    public void open(){
        System.out.println("THE SYSTEM IS ALREADY OPEN");
    }
    public void close(){
        System.out.println("CLOSING THE SYSTEM....");
        context.setState(new ClosedState(context));
    }
}