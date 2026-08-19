public class DrawingToolbar{
    private Command command;
    private Command lastCommand;
    public void setCommand(Command cmd){
        this.command = cmd;
    }
    public void clickButton(){
        if(command!=null){
            command.execute();
            lastCommand = command;
        }
    }
    public void undo(){
        if(lastCommand!=null)
            lastCommand.undo();

    }
}