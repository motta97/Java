public class MobileAppNotifier implements Observer{
    @Override
    public void update(String DeviceId, String AlertType){
        System.out.println("[Mobile App Notifier] Device ID: "+DeviceId+" Alert Type: "+AlertType);
    }
}