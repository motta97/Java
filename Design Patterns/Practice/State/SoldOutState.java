public class SoldOutState implements State{
    
    private GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter(){
        System.out.println("Sorry, we're sold out");
    }
    public void ejectQuarter(){
        System.out.println("You didn't (and can't) insert quarter");
    }
    public void turnCrank(){
        System.out.println("Sorry, we're sold out");
    }
    public void dispense(){
        System.out.println("Sorry, we're sold out");
    }


}