public class StarBuzzCoffee{
    public static void main(String[] args) {
        

        Beverage beverage1= new Esperesso();
        System.out.println("Description: "+beverage1.getDescription()+" Cost: "+beverage1.cost());
        //now we need to add something to it
        beverage1 = new Mocha(beverage1);//add mocha to it
        beverage1 = new Mocha(beverage1);//add another mocha to it
        System.out.println("Description: "+beverage1.getDescription()+" Cost: "+beverage1.cost());
        beverage1 = new Whip(beverage1);//add whip to it
        System.out.println("Description: "+beverage1.getDescription()+" Cost: "+beverage1.cost());
    }   
}