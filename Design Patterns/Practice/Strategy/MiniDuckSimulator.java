public class MiniDuckSimulator{
    public static void main(String[] args) {
        Duck maller =new MallerDuck();
        maller.performFly();
        maller.performQuack();
        maller.display();

        Duck modelduck = new ModelDuck();
        modelduck.setFlyBehevior(new FlyRocketPowered());
        modelduck.setQuackBehavior(new Quack());
        modelduck.performFly();
        modelduck.performQuack();
    }
}