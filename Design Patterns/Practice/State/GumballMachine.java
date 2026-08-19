public class GumballMachine{
    State noQuarterState;
    State quarterState;
    State soldOutState;
    State currentState = noQuarterState;
    int count = 0;
    public GumballMachine(int numGumballs){
        noQuarterState = new NoQuarterState(this);
        quarterState = new QuarterState(this);
        soldOutState = new SoldOutState(this);

        this.count=numGumballs;
        if(count>0){
            currentState = noQuarterState;
        }
        else {
            currentState = soldOutState;
        }

    }

    public void insertQuarter(){
        currentState.insertQuarter();
    }
    public void ejectQuarter(){
        currentState.ejectQuarter();
    }
    public void turnCrack(){
        currentState.turnCrank();
    }
    public void dispense(){
        currentState.dispense();
    }
    public State getNoQuarterState(){
        return noQuarterState;
    }
    public State getHasQuarterState(){
        return quarterState;
    }
    public void setState(State state){
        currentState = state;
    }
    public State getSoldOutState(){
        return soldOutState;
    }
    public void reduceCount(){
        count--;
        if(count ==0){
            setState(getSoldOutState());
        }
        else {
            setState(getNoQuarterState());
        }

    }
}