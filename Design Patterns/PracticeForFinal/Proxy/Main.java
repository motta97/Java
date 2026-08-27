public class Main{
    public static void main(String[] args) {
        ProtectiveProxy protectiveProxy = new ProtectiveProxy("ADMIN");
        protectiveProxy.execute();
        protectiveProxy = new ProtectiveProxy("NON-ADMIN");
        protectiveProxy.execute();
    }
}