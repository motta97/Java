public class ExpressDelivery
        implements DeliveryStrategy {

    @Override
    public String getName() {
        // TODO 3: return the correct delivery name.
        return "Express Delivery";
    }

    @Override
    public double calculateFee() {
        // TODO 3: return 30.00 EGP.
        return 30.00;
    }
}
