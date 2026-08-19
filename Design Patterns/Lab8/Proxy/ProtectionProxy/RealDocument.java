public class RealDocument implements Document{
    private String des;
    public RealDocument(String des){
        this.des = des;
    }
    public void view(){
        System.out.println("PRINTING THE REAL IMAGE "+des );
    }
}