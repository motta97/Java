public class Mocha extends Decorator{
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    public double cost(){
        return beverage.cost()+1.99;
    }
}