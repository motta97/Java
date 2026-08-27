public class TVTurnOnCommand implements ICommand{
    TV tv;
    public TVTurnOnCommand(TV tv){
        this.tv = tv;
    }
    public void execute(){
        tv.turnOn();
    }
    public void undo(){
        tv.turnOff();
    }
}