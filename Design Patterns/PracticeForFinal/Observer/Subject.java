public interface Subject{
    void addObserver(Observer O);
    void removeObserver(Observer O);
    void notifyObservers(String message);
}