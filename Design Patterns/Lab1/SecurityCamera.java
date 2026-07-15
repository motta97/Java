public class SecurityCamera extends Device implements Switchable{
    private final String resolution;
    public SecurityCamera(String id, String resolution){
        super(id);
        this.resolution=resolution;
    }
    @Override
    public String getStatus(){
        String x = "id: "+super.getDeviceId()+" intensity: "+resolution;
        return x;
    }
    @Override
    public void turnOn(){
        System.out.println("SecurityCamera is now on");
    }
    @Override
    public void turnOf(){
        System.out.println("SecurityCamera is now off");
    }
}
