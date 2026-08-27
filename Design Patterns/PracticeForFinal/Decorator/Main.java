public class Main{
    public static void main(String[] args) {
        Beverage beverage = new NescafeBlack();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.cost());
    }
}