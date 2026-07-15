public class CashPayment extends PaymentMethod implements Payable {
    public CashPayment(String accountHolder){
        super(accountHolder);
    }
    @Override
    public void pay(double amount){
        System.out.println("Payment Via Cash is done with amount: "+amount);
    }
    @Override
    public String getPaymentType(){
        return "Cash Payment";
    }
    
}