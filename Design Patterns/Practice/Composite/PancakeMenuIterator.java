
import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator{
    ArrayList<MenuComponent> items;
    int position = 0;
    public PancakeMenuIterator(ArrayList<MenuComponent> items){
        this.items = items;
    } 
    public MenuComponent next(){
        return items.get(position++);
    }
    public boolean hasNext(){
        if(position >= items.size())
            return false;
        return true;
    }
}