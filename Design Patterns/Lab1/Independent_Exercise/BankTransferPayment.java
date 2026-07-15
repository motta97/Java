public class BankTransferPayment extends PaymentMethod implements Payable{
    public BankTransferPayment(String accountHolder){
        super(accountHolder);
    }
    @Override
    public String getPaymentType(){
        return "Bank Transfer Payment";
    }
    @Override
    public void pay(double amount){
        System.out.println("Paid with amount: "+ amount);
    }

}