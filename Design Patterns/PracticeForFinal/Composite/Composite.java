import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> components;
    private String name;

    public Composite(String name){
        this.name= name;
        components = new ArrayList<>();
    }
    public void add(Component component){
        components.add(component);
    }
    public void remove(Component component){
        components.remove(component);
    }
    public void print(String indent){
        System.out.print(indent);
        System.out.println(name);
        ComponentIterator iterator= createIterator();
        while(iterator.hasNext()){
            Component component = iterator.next();
            component.print(indent+indent);
        }
    }
    public ComponentIterator createIterator(){
        return new ConcreteComponentIterator(components);
    }
}