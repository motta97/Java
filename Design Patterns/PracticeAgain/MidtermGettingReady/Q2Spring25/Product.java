public class Product{
    private static int nextId=0;
    private String name;
    private int id;
    private String description;
    public Product(String name){
        this.name= name;
        this.id=nextId++;
    }
    public void setDescription(String des){
        this.description= des;
    }
    public String getDescription(){
        return description;
    }
    
}