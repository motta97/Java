import java.util.ArrayList;
import java.util.List;
public class DrawingCanvas {
    private final List<String> shapes = new ArrayList<>();
    public void addCircle() { shapes.add("Circle"); }
    public void removeCircle() { removeLast("Circle"); }
    public void addRectangle() { shapes.add("Rectangle"); }
    public void removeRectangle() { removeLast("Rectangle"); }
    public void addTriangle(){ shapes.add("Triangle");}
    public void removeTriangle(){removeLast("Triangle");}
    public void showDrawing() {
        System.out.println(shapes);
    }
    private void removeLast(String shape) {
        int index = shapes.lastIndexOf(shape);
        if (index >= 0) shapes.remove(index);
    }
}