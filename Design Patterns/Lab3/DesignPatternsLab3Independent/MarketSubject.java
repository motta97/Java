public interface MarketSubject{
    void registerObserver(MarketObserver observer);
    void removeObserver(MarketObserver observer);
    void notifyObservers();
}