public class Main{
    public static void main(String[] args) {
        CashPayment cash1 = new CashPayment("Mostafa");
        CashPayment cash2 = new CashPayment("Ahmed");
        DigitalWalletPayment digital1 = new DigitalWalletPayment("Ali");
        DigitalWalletPayment digital2 = new DigitalWalletPayment("Mohamed");
        CreditCardPayment credit1 = new CreditCardPayment("Sayyed");
        CreditCardPayment credit2 = new CreditCardPayment("Mahmoud");
        PaymentMethod []payment_arr=new PaymentMethod[6];
        payment_arr[0]=cash1;
        payment_arr[1]=cash2;
        payment_arr[2]=digital1;
        payment_arr[3]=digital2;
        payment_arr[4]=credit1;
        payment_arr[5]=credit2;
        for (int i = 0; i < 6; i++) {
               System.out.println("Account Holder: "+payment_arr[i].getAccountHolder() + " Payment Type: "+payment_arr[i].getPaymentType() );
                ((Payable)payment_arr[i]).pay(20*i);
                if(payment_arr[i] instanceof Refundable){
                    ((Refundable)payment_arr[i]).refund(20*i);
                }
                
        }
    }
}