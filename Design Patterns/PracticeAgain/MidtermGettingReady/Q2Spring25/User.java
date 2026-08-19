public class User {
    private String name;
    private int id;
    private static int nextID=0;
    public User(String name){
        this.name= name;
        this.id = nextID++;
    }
    public int getUserId(){
        return id;
    }
    public String getUserName(){
        return name;
    }
}