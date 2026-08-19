public class SecurityLogObserver implements Observer{
    @Override
    public void update(String DeviceId, String AlertType){
        System.out.println("[Security Log] Recorded event: "+AlertType+" from "+DeviceId);
    }
}