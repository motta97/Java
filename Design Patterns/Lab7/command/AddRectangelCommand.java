public class AddRectangelCommand implements Command{
    private final DrawingCanvas canvas;
    public AddRectangelCommand(DrawingCanvas canvas){
        this.canvas=canvas;
    }
    @Override
    public void execute(){
        canvas.addRectangle();
    }
    public void undo(){
        canvas.removeRectangle();
    }
}