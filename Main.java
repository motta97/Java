import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public  class Main {
   public static void  main(String args[]){
      //let's try to do some economy
   /* we get the first investment, then annual interest rate, then we
   try to calculate the monthly payment back
   first we get the monthly interest rate
   using the realtion 1-(1+i_year)^1/12 = i_month
   then principal=A*(1+i_month)^(12*years)
   then we can get A the monthly payment or Mortgage
    */

      Scanner scanner = new Scanner(System.in);

      int principle;

      while (true){
         System.out.print("Principle ($1k - $1M): ");
         principle =scanner.nextInt();

         if (principle>1000 && principle<1000_000) break;
         System.out.println("Enter a number between 1,000 and 1,000,000.");


      }
      System.out.print("Annual Interest rate: ");
      float annual_rate=scanner.nextFloat();
      while (annual_rate<=0 || annual_rate>30){
         System.out.println("Enter a value greater than 0 and less than or equal to 30.");
         System.out.print("Annual Interest rate: ");
         annual_rate =scanner.nextFloat();
      }
      System.out.print("Period (Years): ");
      int years=scanner.nextInt();
      while (years<=0 || years>30){
         System.out.println("Enter a value between 1 and 30.");
         System.out.print("Period (Years): ");
         years=scanner.nextInt();
      }
      //now we've got inputs, we can proceed to calculations
      //first we get the monthly rate
      double month_rate= Math.pow((1+annual_rate/100),1.0/12)-1;
      //now we can proceed to calculating A
      double Mortgage = (principle)/ ((1-Math.pow((1+month_rate),-12.0*years))/month_rate);

      NumberFormat answer=NumberFormat.getCurrencyInstance();

      System.out.println("Mortgage: "+answer.format(Mortgage));







   }

}
//why Java?




/*public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}*/