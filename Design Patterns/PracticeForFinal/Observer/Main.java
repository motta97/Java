public class Main{
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher("Initial state");
        newsPublisher.addObserver(new IndividualObserver());
        newsPublisher.addObserver(new BusinessObserver());
        newsPublisher.updateState("New State");
    }
}