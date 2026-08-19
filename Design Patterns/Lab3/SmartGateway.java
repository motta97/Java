import java.util.ArrayList;
import java.util.List;
public class SmartGateway implements Subject{
    private final List <Observer> listObservers=new ArrayList<>();
    private String latestDeviceId;
    private String latestAlertType;
    public void triggerSystemAlarm(String latestDeviceId, String latestAlertType){
        this.latestAlertType=latestAlertType;
        this.latestDeviceId=latestDeviceId;
        System.out.println("Device ID: "+latestDeviceId);
        System.out.println("Alert Type: "+latestAlertType);
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer){
        if(observer != null)
            listObservers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        if(listObservers.contains(observer))
            listObservers.remove(observer);
    }
    @Override
    public void notifyObservers(){
       for(Observer observer: listObservers){
        observer.update(latestDeviceId,latestAlertType);
       }
    }

}