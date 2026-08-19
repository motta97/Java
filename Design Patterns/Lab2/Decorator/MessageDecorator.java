public abstract class MessageDecorator implements MessageProcessor{
    protected MessageProcessor messageProcessor;
    public MessageDecorator(MessageProcessor messageProcessor){
        this.messageProcessor=messageProcessor;
    }
}