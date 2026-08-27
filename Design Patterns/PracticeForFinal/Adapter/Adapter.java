public class Adapter implements ITarget{
   Adaptee adaptee = new Adaptee();
    public void execute(){
        adaptee.run();
    }
}