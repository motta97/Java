public class Context{
    ReminderStrategy reminderStrategy;
    public void setReminderStrategy(ReminderStrategy strategy){
        this.reminderStrategy= strategy;
    }
    public void sendReminder(){
        if(reminderStrategy!=null){
            reminderStrategy.send();
        }
    }
}