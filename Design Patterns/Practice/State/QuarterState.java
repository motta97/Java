public class QuarterState implements State{
    
    private GumballMachine gumballMachine;
    public QuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter(){
        System.out.println("you already inserted a quarter");
        
    }
    public void ejectQuarter(){
        System.out.println("ejecting quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public void turnCrank(){
        System.out.println("Turning the crank...");
    }
    public void dispense(){
        System.out.println("Dispensing....");
        gumballMachine.reduceCount();
    }


}
//this state is dead-end, we can't get out of it, but this example is just a matter of education about state pattern