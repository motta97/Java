public class EmergencyAlarm implements Observer{
    @Override
    public void update(String DeviceId, String AlertType){
        if(AlertType.equals("FIRE")||AlertType.equals("INTRUSION")){
            System.out.println("[EMERGENCY ALARM FIRED!] "+ "Device ID: "+DeviceId+ " Alert Type: "+AlertType);

        }
        else{
            System.out.println("Event Ignored");
        }
    }
}