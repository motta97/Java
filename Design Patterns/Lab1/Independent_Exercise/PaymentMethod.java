public abstract class PaymentMethod{
    private final String accountHolder;
    public PaymentMethod(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }

    public abstract String getPaymentType();
}