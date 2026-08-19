public class CurrentConditionDisplay implements DisplayElement, Observer{
    private WeatherData weatherData;
    private float temp;
    private float hum;
    private float pressure;
    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float hum, float pressure){
        this.temp=temp;
        this.hum=hum;
        this.pressure=pressure;
        display();
    }
    @Override
    public void display(){
        System.out.println("We're doing current condition here: ");
        System.out.println("Current Temp is: "+ temp+ " humidity is: "+hum+ " pressure is: "+pressure);

    }
    
}