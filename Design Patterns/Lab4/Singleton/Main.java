public class Main{
    public static void main(String[] args) {
        ApplicationSettings instance1=ApplicationSettings.getInstance();
        instance1.setEnvironment("instance1");
        ApplicationSettings instance2=ApplicationSettings.getInstance();
        System.out.println("Same object: "+(instance1==instance2));
        System.out.println("Environment throught Instance 2: "+instance2.getEnvironment());
        
    }   
}