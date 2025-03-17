public class Carpet {
    private double cost;
    // write code here
    public Carpet (double cost){
        if (cost<0)cost=0;
        else this.cost=cost;
    }
    public double getCost(){
        return cost;
    }
}
