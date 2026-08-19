
public class Lab08_virtual_proxy {

    public static void main(String[] args) {
        Image image = new ImageProxy("campus-map.png");
        System.out.println("Proxy created. Real image should not be loaded yet.");

        System.out.println("\nFirst display:");
        image.display();

        System.out.println("\nSecond display:");
        image.display();
    }
    
}
