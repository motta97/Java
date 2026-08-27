
import java.util.Scanner;

public class View{
    Scanner input = new Scanner(System.in);
    public void showMainMenu(){
        System.out.println("-----------------------------------");
        System.out.println("WELCOME TO THE IC VERIFICATOIN SOFTWARE");
        System.out.println("-----------------------------------");
    }
    public String getString(String message){
        System.out.println("Please enter "+message);
        return input.nextLine();
    }
    public int getInt(String message){
        System.out.println("Please enter "+message);
        while(!input.hasNextInt()){
            System.out.println("Please enter a valid number");
            input.next();
        }
        int value = input.nextInt();
        input.nextLine();
        return value;
    }
    public void displayMessage(String message){
        System.out.println(message);
    }
}