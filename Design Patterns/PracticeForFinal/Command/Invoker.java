public class Invoker{
    ICommand command;
    public void setCommand(ICommand command){
        this.command= command;
    }
    public void execute(){
        command.execute();
    }
    public void undo(){
        command.undo();
    }
}