public class RegistrationModel{
    private String studentID;
    private String courseCode;
    private boolean success;
    private String statusMessage;
    public void setStudentID(String ID){
        this.studentID=ID;
    }
    public void setCourseCode(String code){
        this.courseCode=code;
    }
    public void setSuccess(boolean s){
        this.success=s;
    }
    public void setStatusMessage(String m){
        this.statusMessage=m;
    }
    public String getStudentID(){
        return studentID;
    }
    public boolean getSuccess(){
        return success;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public String getStatusMessage(){
        return statusMessage;
    }
    public void update(String sid, String courseCode, boolean success, String statusMessage){
        setStudentID(sid);
        setStatusMessage(statusMessage);
        setCourseCode(courseCode);
        setSuccess(success);
    }


}