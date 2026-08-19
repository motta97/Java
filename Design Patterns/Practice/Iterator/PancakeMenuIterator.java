
import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;
    public PancakeMenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    } 
    public MenuItem next(){
        return items.get(position++);
    }
    public boolean hasNext(){
        if(position >= items.size())
            return false;
        return true;
    }
}