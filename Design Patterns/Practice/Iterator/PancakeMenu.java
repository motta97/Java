
import java.util.ArrayList;

public class PancakeMenu{
    ArrayList<MenuItem> items;
    public PancakeMenu(){
        this.items = new ArrayList<>();
    }
    public void addItem(String name, String description){
        items.add(new MenuItem(name, description));
    }
    public Iterator createPancakeIterator(){
        return new PancakeMenuIterator(items);
    }
}