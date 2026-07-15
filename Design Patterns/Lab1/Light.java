public class Light extends Device implements Switchable{
    private final int intensity;
    public Light(String id, int intensity){
        super(id);
        this.intensity=intensity;
    }
    @Override
    public String getStatus(){
        String x = "id: "+super.getDeviceId()+" intensity: "+intensity;
        return x;
    }
    @Override
    public void turnOn(){
        System.out.println("Light is now on");
    }
    @Override
    public void turnOf(){
        System.out.println("Light is now off");
    }
}
