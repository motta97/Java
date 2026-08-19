public class AddTriangleCommand implements Command{
    private final DrawingCanvas canvas;
    public AddTriangleCommand(DrawingCanvas canvas){
        this.canvas = canvas;
    }
    public void execute(){
        canvas.addTriangle();
    }
    public void undo(){
        canvas.removeTriangle();
    }
}