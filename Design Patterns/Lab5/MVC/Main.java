public class Main{
    public static void main(String[] args) {
        RegistrationController controller = new RegistrationController();
        RegistrationView view = new RegistrationView();
        view.displayHeader();
        controller.submitRegistration("S1001", "CSE336");
        controller.submitRegistration("S1003", "CSE450");
        
    }    
} 