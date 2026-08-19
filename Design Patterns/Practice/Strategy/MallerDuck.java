public class MallerDuck extends Duck{
    public MallerDuck(){
        super.flyBehavior= new FlyWithWings();
        super.quackBehavior= new Quack();
    }
    @Override
    public void display(){
        System.out.println("I am a real Maller Duck");
    }
}
