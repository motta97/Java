public class Main{
    public static void main(String[] args) {
        String payload = "payload123";
        Device d;
        d= new SecurityCamera("20","1920*2096");
        d.setCommunicationStrategy(new WiFiStrategy());
        d.uploadData(payload);
        d.setCommunicationStrategy(new CellularStrategy());
        d.uploadData(payload);
    }
}