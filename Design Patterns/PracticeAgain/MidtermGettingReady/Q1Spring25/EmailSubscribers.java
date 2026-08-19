public class EmailSubscribers implements Observer{
    private PublishingSystem system;
    public EmailSubscribers(PublishingSystem system){
        this.system=system;
        system.registerObserver(this);
    }
    public void update(NotificationComponent notification){
        System.out.println("Got Notification: "+ notification.getDescription()+ " in EMAIL");
    }

}