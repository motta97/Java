public class MobileAppUsers implements Observer{
    private PublishingSystem system;
    public MobileAppUsers(PublishingSystem system){
        this.system=system;
        system.registerObserver(this);
    }
    public void update(NotificationComponent notification){
        System.out.println("Got Notification: "+ notification.getDescription()+ " in MOBILE APP USERS");
    }
    
}