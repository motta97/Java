public class PizzaFactory{
    public static Pizza pizza;
    public static Pizza orderPizza(String type){
        if(type.equals("Marghirita"))
            pizza = new Marghirita();
        else if(type.equals("Cheese"))
            pizza = new Cheese();
        else
            pizza = null;
        return pizza;
    }
}