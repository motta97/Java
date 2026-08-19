public class RegistrationController{
    private RegistrationModel model;
    private RegistrationView view;
    private CourseRegistrationFacade facade;
    private RegistrationResult result;
    public RegistrationController(){
        facade=new CourseRegistrationFacade();
        view = new RegistrationView();
        model = new RegistrationModel();
        result = new RegistrationResult();
    }
    public void submitRegistration(String sutdentId, String courseCode){
        result = facade.registerCourse(sutdentId, courseCode);
        model.update(sutdentId, courseCode, result.getSuccess(),result.getMessage());
        view.displayResult(model);
    }
}