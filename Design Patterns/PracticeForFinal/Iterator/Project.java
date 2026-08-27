
import java.util.ArrayList;
import java.util.List;
//the project contains multiple desings
public class Project{
    List<Design> designs = new ArrayList<>();
    public void addDesign(Design design){
        this.designs.add(design);
    }
    public void removeDesign(Design design){
        this.designs.remove(design);
    }
    public DesignsIterator createIterator(){
        return new ConcreteDesignIterator(designs);
    }


}