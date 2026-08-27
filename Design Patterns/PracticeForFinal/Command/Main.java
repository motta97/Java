public class Main{
    public static void main(String[] args) {
        TVTurnOnCommand tVTurnOnCommand = new TVTurnOnCommand(new TV());
        Invoker invoker = new Invoker();
        invoker.setCommand(tVTurnOnCommand);
        invoker.execute();
        invoker.undo();
    }
}