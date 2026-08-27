public class ProtectiveProxy implements ISubject{
    private RealSubject subject = new RealSubject();
    private String userType;
    public ProtectiveProxy(String userType){
        this.userType=userType;
    }
    public void execute(){
        if(userType.equals("ADMIN")){
            subject.execute();
        }
        else{
            System.out.println("SORRY YOU'RE NOT AUTHORIZED");
        }
    }
}