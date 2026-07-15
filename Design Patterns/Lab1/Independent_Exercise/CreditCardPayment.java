

public class CreditCardPayment extends PaymentMethod implements Payable, Refundable{
    public CreditCardPayment(String accountHolder){
        super(accountHolder);
    }
    @Override
    public String getPaymentType(){
        return "Credit Card Payment";
    }
    @Override
    public void refund(double amount){
        System.out.println("Refund is done using credit card with amount: "+amount);
    }
    @Override
    public void pay(double amount){
        System.out.println("Payment is done using credit card with amount: "+amount);
    }
}