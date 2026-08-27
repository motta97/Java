
import java.util.List;

public class ConcreteComponentIterator implements ComponentIterator{
    private List<Component> components;
    private int position = 0;
    public ConcreteComponentIterator(List<Component> components){
        this.components=components;
    }
    public boolean hasNext(){
        return position<components.size();
    }
    public Component next(){
        return components.get(position++);
    }

}