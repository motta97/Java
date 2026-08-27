public class IndividualObserver implements Observer{
    public void notify(String message){
        System.out.println("An indvidual is recieving the message ["+message+"]");
    }
}