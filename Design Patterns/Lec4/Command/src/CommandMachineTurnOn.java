public class CommandMachineTurnOn implements ICommand{
    public WashingMachine washingMachine;
    public CommandMachineTurnOn(WashingMachine washingMachine){
        this.washingMachine = washingMachine;
    }
    @Override
    public void execute() {
        washingMachine.setTimer(90);
        washingMachine.turnOn();

    }
    @Override
    public void undo() {
        washingMachine.turnOff();
    }
}
