
import java.util.ArrayList;

public class Menu extends MenuComponent{
    String menuName;
    String menuDescription;
    ArrayList<MenuComponent> menuComponents= new ArrayList<>();
    
    public Menu(String name, String description){
        this.menuName = name;
        this.menuDescription = description;
    }
    public void add(MenuComponent component){
        menuComponents.add(component);
    }
    public void remove(MenuComponent component){
        menuComponents.remove(component);
    }
    public MenuComponent getChild(int i){
        return this.menuComponents.get(i);
    }
    public String getName(){
        return menuName;
    }
    public String getDescription(){
        return menuDescription;
    }
    public void print(){
        System.out.print("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("---------------------------");

        for(MenuComponent component: menuComponents){
            component.print();
        }
    }



}