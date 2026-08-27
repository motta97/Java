public class Main{
    public static void main(String[] args) {
        Context context = new Context();
        context.setReminderStrategy(new SMSStrategy());
        context.sendReminder();
        context.setReminderStrategy(new WhatsAppStrategy());
        context.sendReminder();
    }
}