public class CellularStrategy implements CommunicationStrategy{
    public void sendData(String payload){
        System.out.println("Sending "+payload+ " via Cellular");
    }
    
}