public class Main{
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter adapter = new TurkeyAdapter(turkey);
        adapter.fly();
        adapter.quack();
    }
}