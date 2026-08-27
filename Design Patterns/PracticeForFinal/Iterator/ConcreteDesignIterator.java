import java.util.List;
public class ConcreteDesignIterator implements DesignsIterator{
    private List<Design> designs;
    private int position = 0;
    public ConcreteDesignIterator(List<Design> designs){
        this.designs= designs;
    }
    public boolean hasNext(){
        return position <designs.size();
    }
    public Design next(){
        return designs.get(position++);
    }
}