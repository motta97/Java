public class Mocha extends Decorator{
    public Mocha(Beverage beverage){
        this.beverage= beverage;
    }
    public double cost(){
        return 2.3+beverage.cost();
    }
}