public class Main{
    public static void main(String[] args) {
        String payload1, payload2;
        Device camera = new SecurityCamera("123","339");
        MessageProcessor securePipeline = new EncryptionDecorator(
            new CompressionDecorator(
                new BaseMessageProcessor()
            )
        );
        payload1 = securePipeline.Process("ALERT: Motion detected in server room");
         camera.setCommunicationStrategy(new CellularStrategy());
         camera.uploadData(payload1);
        securePipeline = new CompressionDecorator(
            new EncryptionDecorator(
                new BaseMessageProcessor()
            )
        );
        payload2 = securePipeline.Process("ALERT: Motion detected in server room");
         camera.setCommunicationStrategy(new CellularStrategy());
         camera.uploadData(payload2);

         camera.setCommunicationStrategy(new ZigbeeStrategy());
         camera.uploadData(payload2);
         


         
    }
}