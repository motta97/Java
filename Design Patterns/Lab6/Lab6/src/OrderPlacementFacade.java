import java.io.IOException;

public class OrderPlacementFacade {
    private final FleetManager fleetManager;
    private final String orderFile;

    public OrderPlacementFacade(FleetManager fleetManager,
                                String orderFile) {
        this.fleetManager = fleetManager;
        this.orderFile = orderFile;
    }

    public void placeOrder(Order order,
                           DeliveryStrategy strategy)
            throws IOException {
        // TODO 7: coordinate these steps in order:

        // 1. calculate and store delivery details;
        order.setDelivery(strategy.getName(),
                strategy.calculateFee());
        // 2. assign and store one courier;

        order.setCourier(fleetManager.assignCourier());

        // 3. change status to PLACED;
        order.setStatus(OrderStatus.PLACED);


        // 4. append the order to orders.csv.
        CsvHelper.appendOrder(orderFile, order);

        //order.setCourier("TODO-COURIER");
    }
}
