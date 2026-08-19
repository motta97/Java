public class CustomerNotifier implements OrderObserver {
    @Override
    public void update(Order order) {
        // TODO 6: display a customer status message.
        System.out.println("Order was placed with ID: "+ order.getOrderId());
    }
}
