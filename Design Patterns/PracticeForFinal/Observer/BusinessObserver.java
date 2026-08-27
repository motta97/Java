public class BusinessObserver implements Observer{
    public void notify(String message){
        System.out.println("A Business is recieving the message ["+message+"]");
    }
}