import java.util.ArrayList;
import java.util.List;   
public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer O){
        observers.add(O);
    }
    public void removeObserver(Observer O){
        observers.remove(O);
    }
    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(temperature, humidity, pressure);
        }
    }
    //we call notifyObservers() when we get the data
    public void measurementsChanged(){
       notifyObservers();
    }
    public void setMeasurements(float temp, float hum, float pressure){
        this.temperature=temp;
        this.humidity=hum;
        this.pressure=pressure;
        measurementsChanged();
    }
}