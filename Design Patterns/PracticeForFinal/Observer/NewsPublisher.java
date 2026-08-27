
import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject{
    String state;
    public NewsPublisher(String state){
        this.state= state;
    }
    List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer O){
        observers.add(O);
    }
    public void removeObserver(Observer O){
        observers.remove(O);
    }
    public void notifyObservers(String message){
        for(Observer O: observers){
            O.notify(message);
        }
    }
    public void updateState(String message){
        this.state= message;
        notifyObservers(message);
    }
}