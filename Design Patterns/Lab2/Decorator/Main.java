public class Main{
    public static void main(String[] args) {
        MessageProcessor mp=new BaseMessageProcessor();
        System.out.println(mp.Process("Alert: There's a quiz this Saturday"));
        mp = new EncryptionDecorator(mp);
         System.out.println(mp.Process("Alert: There's a quiz this Saturday"));
        mp = new CompressionDecorator(mp);
        System.out.println(mp.Process("Alert: There's a quiz this Saturday"));
        MessageProcessor securePipeline =
            new EncryptionDecorator(
                new CompressionDecorator(
                    new BaseMessageProcessor()
                )
            );
        String finalPayload = securePipeline.Process(
        "ALERT: Motion detected in server room"
        );
        System.out.println(finalPayload);
    }
}