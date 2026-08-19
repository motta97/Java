public class BreakingNewsAlertDecorator extends NotificationDecorator{
    public BreakingNewsAlertDecorator(NotificationComponent component){
        this.component= component;
    }@Override
    public String getDescription(){
        return component.getDescription()+", Breaking News Alert";
    }
}