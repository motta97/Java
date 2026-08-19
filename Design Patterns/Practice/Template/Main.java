public class Main{
    public static void main(String[] args) {
        //let's make some tea
        CaffieneBeverage beverage = new Tea();
        beverage.prepareRecipe();
        System.out.println("**********");
        //want some coffee?
        beverage = new Coffee();
        beverage.prepareRecipe();
    }
}