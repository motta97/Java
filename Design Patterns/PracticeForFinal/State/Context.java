public class Context{
    IState currentState;
    public Context(){
        this.currentState= new ClosedState(this);
    }
    public void setState(IState state){
        this.currentState = state;
    }
    public void open(){
        if(currentState!=null){
            currentState.open();
        }
    }
    public void close(){
        if(currentState!=null){
            currentState.close();
        }
    }
    public IState getCurrentState(){
        return currentState;
    }
}