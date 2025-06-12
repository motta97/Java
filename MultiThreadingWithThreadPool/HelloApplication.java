import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {



        ExecutorService executer =  Executors.newFixedThreadPool(3);
        executer.execute(new PrintChar('a',100));
        executer.execute(new PrintChar('b',100));
        executer.execute(new PrintInt(50));

        executer.shutdown();
       
    }
}

 class PrintChar implements Runnable{
    char c;
    int n;
  

    PrintChar(char c, int n){
        this.c=c;
        this.n=n;
    }


    public void run (){
        for(int i = 0 ; i<n; i++){
            System.out.print(c);
        }
    }
}
class PrintInt implements Runnable{
    int x;
    PrintInt(int x){
        this.x= x;
    }
    public void run(){
        for(int i = 0 ; i<x; i++){
            System.out.print(i+1);


        }
    }
}
