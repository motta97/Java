public class Design{
    private String des;
    private String RTL;
    public Design(String des, String RTL){
        this.des=des;
        this.RTL=RTL;
    }
    public void print(){
        System.out.println("-------------------------");
        System.out.println(des);
        System.out.println(RTL);
        System.out.println("-------------------------");
    }
}