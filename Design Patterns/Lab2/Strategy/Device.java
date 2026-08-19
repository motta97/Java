public abstract class Device {
    private String deviceId;
    private CommunicationStrategy communicationStrategy;
    public Device(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public abstract String getStatus();
    
    public void setCommunicationStrategy(CommunicationStrategy strategy){
        this.communicationStrategy=strategy;
    }
    public void uploadData(String payload){
        this.communicationStrategy.sendData(payload);

    }
}
