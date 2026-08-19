public class CommandTVTurnOn implements ICommand{
    public TV tv;
    public CommandTVTurnOn(TV tv){
        this.tv = tv;
    }
    public void execute(){

        System.out.println("CommandTVTurnOn.execute()");
    }

    public void undo(){
        tv.turOff();
    }
}
