public class AddCircleCommand implements Command{
    private final DrawingCanvas canvas;
    public AddCircleCommand(DrawingCanvas canvas){
        this.canvas = canvas;
    }
    @Override
    public void execute(){
        canvas.addCircle();
    }
    public void undo(){
        canvas.removeCircle();
    }
}