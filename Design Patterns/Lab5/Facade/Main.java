public class Main{
    public static void main(String[] args) {
        RegistrationResult result = new RegistrationResult();
        CourseRegistrationFacade courseRegistrationFacade= new CourseRegistrationFacade();
        result=courseRegistrationFacade.registerCourse("S1001", "CSE336");
        System.out.println("Test Case 1: ");
        System.out.println("Success: "+result.getSuccess());
        System.out.println("Message: "+result.getMessage());
        System.out.println("");
        result = courseRegistrationFacade.registerCourse("S1002", "CSE499");
        System.out.println("Test Case 2: ");
        System.out.println("Success: "+result.getSuccess());
        System.out.println("Message: "+result.getMessage());
        System.out.println("");
        result = courseRegistrationFacade.registerCourse("S1003", "CSE450");
        System.out.println("Test Case 3: ");
        System.out.println("Success: "+result.getSuccess());
        System.out.println("Message: "+result.getMessage());
        System.out.println("");
        result = courseRegistrationFacade.registerCourse("S1004", "CSE440");
        System.out.println("Test Case 4: ");
        System.out.println("Success: "+result.getSuccess());
        System.out.println("Message: "+result.getMessage());
        System.out.println("");
    }
}