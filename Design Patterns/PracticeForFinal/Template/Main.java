public class Main{
    public static void main(String[] args) {
        DesignFlow designFlow = new SOTAFourNanoMeter();
        designFlow.process("NEW DESIGN");
        designFlow = new TenNanoMeter();
        designFlow.process("LEGACY DESIGN");
    }
}