public class BasicNewsAlertDecorator extends NotificationDecorator{
    public BasicNewsAlertDecorator(NotificationComponent component){
        this.component= component;
    }@Override
    public String getDescription(){
        return component.getDescription()+ ", Basic news Alert";
    }
}