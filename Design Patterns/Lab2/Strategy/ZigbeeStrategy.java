public class ZigbeeStrategy implements CommunicationStrategy{
    public void sendData(String payload){
        System.out.println("Sending "+payload+ " via Zigbee");
    }
    
}