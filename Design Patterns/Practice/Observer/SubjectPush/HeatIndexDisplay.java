public class HeatIndexDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;
    private float temp;
    private float hum;
    private float pressure;
    private double heatIndex;
    public HeatIndexDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float hum, float pressure){
        this.hum=hum;
        this.pressure=pressure;
        this.temp=temp;
        calcHeatIndex();
        display();
    }
    public void calcHeatIndex(){
        this.heatIndex=16.923 + 1.85212 * 1/10 * temp + 5.37941 * hum - 1.00254 * 1/10 *
temp * hum + 9.41695 * 1/1000 * temp*temp + 7.28898 * 1/1000 * hum*hum + 3.45372 *
1/10000 * temp*temp * hum - 8.14971 * 1/10000 * temp * hum*hum + 1.02102 * 1/100000 * temp*temp *
hum*hum - 3.8646 * 1/100000 * temp*temp*temp + 2.91583 * 1/100000 * hum*hum*hum + 1.42721 * 1/1000000
* temp*temp*temp * hum + 1.97483 * 1/1000000 * temp * hum*hum*hum - 2.18429 * 1/100000000 * temp*temp*temp * hum*hum
+ 8.43296 * 1/1000000000 * temp*temp * hum*hum*hum - 4.81975 * 1/1000000000 * temp*temp*temp * hum*hum*hum;
    
    }
    @Override
    public void display(){
        System.out.println("Heat index is: "+heatIndex);
         
    }
}