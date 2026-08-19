public class CompressionDecorator extends MessageDecorator{
    public CompressionDecorator(MessageProcessor messageProcessor){
        super(messageProcessor);
    }
    @Override
    public String Process(String msg){
        return "[Compression Applied -> " +  messageProcessor.Process(msg)+"]";
    }
}