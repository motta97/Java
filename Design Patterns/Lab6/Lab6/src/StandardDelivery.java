public class StandardDelivery
        implements DeliveryStrategy {

    @Override
    public String getName() {
        return "Standard Delivery";
    }

    @Override
    public double calculateFee() {
        return 15.00;
    }
}
