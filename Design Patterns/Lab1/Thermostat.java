public class Thermostat extends Device{
    private final double targetTemperature;
    public Thermostat(String id, double temp){
        super(id);
        this.targetTemperature=temp;
    }
    @Override
    public String getStatus(){
        String x = "id: "+super.getDeviceId()+" intensity: "+targetTemperature;
        return x;
    }
}