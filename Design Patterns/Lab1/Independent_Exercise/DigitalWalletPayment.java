public class DigitalWalletPayment extends PaymentMethod implements Payable{
    public DigitalWalletPayment(String accountHolder){
        super(accountHolder);
    }
    @Override
    public void pay(double amount){
        System.out.println("Payment Via Digital Wallet is done with amount: "+amount);
    }
    @Override
    public String getPaymentType(){
        return "Digital Wallet Payment";
    }
}