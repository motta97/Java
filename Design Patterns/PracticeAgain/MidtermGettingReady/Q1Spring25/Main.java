

public class Main{
    public static void main(String[] args) {
        PublishingSystem publishingSystem = new PublishingSystem();
        NotificationComponent notificationComponent = new Notification("TEST NOTIFICATION");
       
        notificationComponent = new BasicNewsAlertDecorator(notificationComponent);
        notificationComponent = new BreakingNewsAlertDecorator(notificationComponent);
        notificationComponent = new DetailedNewsSummary(notificationComponent);
        publishingSystem.setNotification(notificationComponent);
        EmailSubscribers emailSubscribers  = new EmailSubscribers(publishingSystem);
        MobileAppUsers mobileAppUsers = new MobileAppUsers(publishingSystem);
        publishingSystem.notifyObservers();
    }
}