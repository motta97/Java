public class Whip extends Decorator{
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    public double cost(){
        return 5+beverage.cost();
    }
}