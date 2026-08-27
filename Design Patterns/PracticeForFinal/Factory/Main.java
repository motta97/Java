public class Main{
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.orderPizza("Marghirita");
        if(pizza!=null)
        {
            pizza.prepare();
            pizza.box();
        }
    }
}