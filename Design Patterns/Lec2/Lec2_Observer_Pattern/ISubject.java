public interface ISubject{
    public void addObserver(IObserver x);
    public void removeObserver(IObserver x);
    public void NotifyAllObservers();
    
}