public class Main{
    public static void main(String[] args) {
        Beverage beverage = new Esperesso();
         beverage = new Mocha(beverage);
        System.out.println( beverage.cost());
    }
}