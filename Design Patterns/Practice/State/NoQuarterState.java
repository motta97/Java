public class NoQuarterState implements State{
    
    private GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter(){
        System.out.println("you inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    public void ejectQuarter(){
        System.out.println("you haven't inserted the quarter");
    }
    public void turnCrank(){
        System.out.println("You turned but there's no quarter");
    }
    public void dispense(){
        System.out.println("You need to pay first");
    }


}