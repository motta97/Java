public class Main{
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand cmd  = new LightOnCommand(light);
        SimpleRemoteControl RC = new SimpleRemoteControl();
        RC.setCommand(cmd);
        RC.execute();
        RC.undo();

    }
}