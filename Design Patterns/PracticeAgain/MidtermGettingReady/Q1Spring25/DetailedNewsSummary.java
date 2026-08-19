public class DetailedNewsSummary extends NotificationDecorator{
    public DetailedNewsSummary(NotificationComponent component){
        this.component= component;
    }
    @Override
    public String getDescription(){
        return component.getDescription()+", Detailed News Summary";
    }
}