public abstract class Device{
    private final String deviceId;
    public Device(String deviceId){
        this.deviceId=deviceId;
    }
    public String getDeviceId(){
        return this.deviceId;
    }
    public abstract String getStatus();
}