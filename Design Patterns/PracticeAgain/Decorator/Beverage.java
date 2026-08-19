public abstract class Beverage{
    private String description = "UNKNOWN";
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}