public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;



    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public abstract void display();
    public void setFlyBehevior(FlyBehavior fb){
        this.flyBehavior=fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior=qb;
    }
}