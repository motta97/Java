public class RegistrationResult{
    private boolean success;
    private String message;
    public void setSuccess(boolean s){
        this.success=s;
    }
    public void setMessage(String m){
        this.message=m;
    }
    public boolean getSuccess(){
        return success;
    }
    public String getMessage(){
        return message;
    }
}