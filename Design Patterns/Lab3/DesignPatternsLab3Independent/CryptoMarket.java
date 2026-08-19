import java.util.ArrayList;
import java.util.List;

public class CryptoMarket implements MarketSubject{
    private List<MarketObserver> observers = new ArrayList<>();
    private double latestPrice;
    private String latestSymbol;

    public void setPrice(double latestPrice, String latestSymbol){
        this.latestPrice=latestPrice;
        this.latestSymbol=latestSymbol;
        notifyObservers();
    }
    @Override
    public void registerObserver(MarketObserver observer){
        if(observer!=null)
            observers.add(observer);
    }
    @Override
    public void removeObserver(MarketObserver observer){
        if(observers.contains(observer))
            observers.remove(observer);
    }
    @Override
    public void notifyObservers(){
        for (MarketObserver observer: observers){
            observer.onPriceChange(latestSymbol, latestPrice);
        }
    }
}