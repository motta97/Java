public class RegistrationView{
    public void displayHeader(){
        System.out.println("----------COURSE REGISTRATION SERVICE----------");
        System.out.println("");
    }
    public void displayResult(RegistrationModel model){
        System.out.println("Student ID: "+ model.getStudentID());
        System.out.println("Course Code: "+model.getCourseCode());
        System.out.println("Success Status: "+model.getSuccess());
        System.out.println("Status Message: "+model.getStatusMessage());
        System.out.println("");
    }
}