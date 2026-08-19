
import java.util.ArrayList;
import java.util.List;
public class Order{
    private int orderId;
    private static int nextId= 0;
    private List<Product> products = new ArrayList<>();
    public Order(){
        this.orderId=nextId++;
    }
    public void addItem(Product product){
        this.products.add(product);
    }
    public void removeItem(Product product){
        this.products.remove(product);
    }
    public List<Product> getProducts(){
        return products;
    }
}