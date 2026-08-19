public class Main{
    public static void main(String[] args) {
        Observer emergencyAlarm = new EmergencyAlarm();
        Observer mobileAppNotifier = new MobileAppNotifier();
        Observer wallDashboard = new WallDashboard();
        SmartGateway smartGateway = new SmartGateway();
        smartGateway.registerObserver(wallDashboard);
        smartGateway.registerObserver(mobileAppNotifier);
        smartGateway.registerObserver(emergencyAlarm);
        smartGateway.triggerSystemAlarm("Camera_E", "INTRUSION");
        System.out.println("Disabling the mobile notifier");
        smartGateway.removeObserver(mobileAppNotifier);
        smartGateway.triggerSystemAlarm("Sensor_B", "TEMPERATURE_HIGH");

        Observer securityLog = new SecurityLogObserver();
            smartGateway.registerObserver(securityLog);
            smartGateway.triggerSystemAlarm(
            "DoorSensor_MainEntrance",
            "DOOR_OPENED"
            );
            smartGateway.removeObserver(securityLog);
            smartGateway.triggerSystemAlarm(
            "Camera_Garage",
            "INTRUSION"
            );
    }
}