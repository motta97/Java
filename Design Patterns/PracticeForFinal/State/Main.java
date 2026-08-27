public class Main{
    public static void main(String[] args) {
        Context context = new Context();
        context.open();
        context.open();
        context.close();
        context.close();
        context.open();
    }
}