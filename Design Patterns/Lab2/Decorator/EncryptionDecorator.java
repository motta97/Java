public class EncryptionDecorator extends MessageDecorator{
    public EncryptionDecorator(MessageProcessor messageProcessor){
        super(messageProcessor);
    }
    @Override
    public String Process(String msg){
        return   "[Encryption Applied -> "+ messageProcessor.Process(msg)+ "]";
    }
}