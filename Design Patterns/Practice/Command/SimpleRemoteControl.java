public class SimpleRemoteControl{
    private Command command;
    private Command lastCommandExecuted;
    public void setCommand(Command cmd){
        this.command = cmd;
    }
    public void execute(){
        command.execute();
        lastCommandExecuted = command;
    }
    public void undo(){
        if(command!=null)
            command.undo();
    }
}