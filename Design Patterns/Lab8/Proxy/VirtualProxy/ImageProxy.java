
public class ImageProxy implements Image{
    private final String fileName;
    private RealImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Loading image ...");
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
