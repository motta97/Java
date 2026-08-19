public class SecurityCamera extends Device {
    private String resolution;

    public SecurityCamera(String id, String resolution) {
        super(id);
        this.resolution = resolution;
    }

    @Override
    public String getStatus() {
        return "Security Camera " + getDeviceId()
                + " | resolution: " + resolution;
    }
}
