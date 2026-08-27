public class Leaf implements Component{
    String name;
    public Leaf(String name){
        this.name = name;
    }
    public void add(Component component){}
    public void remove(Component component){}
    public void print(String indent){
        System.out.print(indent);
        System.err.println(name);
    }
}