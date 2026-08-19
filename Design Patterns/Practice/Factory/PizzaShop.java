public class PizzaShop{

    SimplePizzaFactory simplePizzaFactory;

    public PizzaShop(SimplePizzaFactory spf) {
        simplePizzaFactory=spf;
    }
    
    
    public Pizza orderPizza(String type){
        Pizza pizza;
        System.out.println("-----Ordering Pizza-----");
        pizza = simplePizzaFactory.createPizza(type);
        if(pizza == null){
            System.out.println("Wrong pizza type");
            return null;
        }
            
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
        
    }
}