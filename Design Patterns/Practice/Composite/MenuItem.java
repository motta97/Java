public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    public MenuItem(String name, String description){
        this.name = name;
        this.description = description;
    }
    public void print(){
        System.out.println("Name: "+ name);
        System.out.println("Description: "+description);
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}