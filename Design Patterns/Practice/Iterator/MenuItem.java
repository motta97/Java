public class MenuItem{
    private String name;
    private String description;
    public MenuItem(String name, String description){
        this.name = name;
        this.description = description;
    }
    public void print(){
        System.out.println("Name: "+ name+ " Description: "+description);
    }
}