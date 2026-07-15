interface vechile{
    public void MakeSound();
    public void Move();
}
class car implements vechile{
    public void MakeSound(){
        print("ennnnenen");
    }
    public void Move(){
        print("Car is moving");
    }
}public class Main{
    public static void main(String[] args){
        System.out.println("hello");
    }
}