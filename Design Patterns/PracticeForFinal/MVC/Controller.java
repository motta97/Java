public class Controller{
    View view = new View();
    Model model = new Model();
    public Controller(){
        view.showMainMenu();
    }
    public void run(){
        getDesign();
    }
    public void getDesign(){
        String design = view.getString("DESIGN IN STRING FORMAT");
        verify(design);

    }

    public void verify(String design){
        int result = model.verify(design);
        if(result != -1){
            view.displayMessage("SUCCESS VEIRIYING FOUND "+result + " BUGS, PLEASE WATCH THE CONSOLE OUTPUT");
        }
        else {
            view.displayMessage("SORRY, THE DESIGN HAS COMPILATION ERRORS");
        }
    }

}