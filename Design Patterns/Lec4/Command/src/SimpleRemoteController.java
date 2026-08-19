public class SimpleRemoteController {
    ICommand slot;
    public SimpleRemoteController(ICommand slot){
        this.slot = slot;
    }
    public void pressButton(){
        slot.execute();
    }
}
