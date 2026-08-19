public class Controller{
    private View view;
    public Controller(){
        view = new View();
        mainMenu();
    }
    private void mainMenu(){
        view.showRegisterMenu();
    }
}