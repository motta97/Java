public class SimplePizzaFactory{
    public Pizza createPizza(String type){
        if(type.equals("Cheese"))
            return new CheesePizza();
        if(type.equals("Greek"))
            return new GreekPizza();
        return null;
    }
}