public class WallDashboard implements Observer{
    @Override
    public void update(String DeviceId, String AlertType){
        System.out.println("[Wall Dashboard] Device ID: "+DeviceId+" Alert Type: "+AlertType);
    }
}