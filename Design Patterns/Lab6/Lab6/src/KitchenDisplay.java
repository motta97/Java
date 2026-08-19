public class KitchenDisplay implements OrderObserver {
    @Override
    public void update(Order order) {
        System.out.println(
                "Kitchen Display: Prepare " +
                order.getMeal().getDescription());
    }
}
