public class ForecastDisplay implements DisplayElement, Observer{
    private WeatherData weatherData;
    private float temp;
    private float hum;
    private float pressure;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void update(){
        this.temp=this.weatherData.getTemp();
        this.hum=this.weatherData.getHum();
        this.pressure=this.weatherData.getPressure();
        display();
    }
    @Override
    public void display(){
        System.out.println("We're doing foreacsting here: ");
        System.out.println("Current Temp is: "+ temp+ " humidity is: "+hum+ " pressure is: "+pressure);

    }
}