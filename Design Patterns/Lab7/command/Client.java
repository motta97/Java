public class Client{
    public static void main(String[] args) {
        DrawingToolbar toolbar = new DrawingToolbar();
        DrawingCanvas canvas = new DrawingCanvas();
        AddCircleCommand addCircleCommand = new AddCircleCommand(canvas);
        AddRectangelCommand addRectangelCommand = new AddRectangelCommand(canvas);
        toolbar.setCommand(addCircleCommand);
        toolbar.clickButton();
        canvas.showDrawing();
        toolbar.setCommand(addRectangelCommand);
        toolbar.clickButton();
        canvas.showDrawing();
        toolbar.undo();
        canvas.showDrawing();

        toolbar.setCommand(new AddTriangleCommand(canvas));
        toolbar.clickButton();
        canvas.showDrawing();
        toolbar.undo();
        canvas.showDrawing();
    }
}