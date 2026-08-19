
public class EligibilityService {
    public boolean isEligible(String studentId, String courseCode){
        //Return false when courseCode is "CSE499"; otherwise true.
        return !("CSE499".equals(courseCode));
        
    }
    
}
