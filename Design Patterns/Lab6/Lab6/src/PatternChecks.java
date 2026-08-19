import java.nio.file.Files;
import java.nio.file.Path;

public class PatternChecks {
    private static int passed;
    private static int failed;

    public static void main(String[] args) throws Exception {
        checkFactory();
        checkDecorator();
        checkStrategy();
        checkSingleton();
        checkCourierRemoval();
        checkObserver();
        checkFacade();

        System.out.printf("%nChecks passed: %d%n", passed);
        System.out.printf("Checks failed: %d%n", failed);
    }

    private static void checkFactory() {
        Meal meal = MealFactory.createMeal(
                new MenuItemData(
                        "M02", "PIZZA",
                        "Margherita Pizza", 100.0));
        check("Factory creates Pizza",
                meal instanceof Pizza);
    }

    private static void checkDecorator() {
        Meal meal = new ComboSide(
                new Burger("Classic Burger", 80.0));
        check("Combo Side adds 25 EGP",
                Math.abs(meal.getPrice() - 105.0) < 0.001);
    }

    private static void checkStrategy() {
        DeliveryStrategy strategy = new ExpressDelivery();
        check("Express fee is 30 EGP",
                Math.abs(strategy.calculateFee() - 30.0) < 0.001);
    }

    private static void checkSingleton() {
        check("FleetManager returns one instance",
                FleetManager.getInstance() ==
                FleetManager.getInstance());
    }

    private static void checkCourierRemoval() {
        FleetManager fleet = FleetManager.getInstance();
        int before = fleet.getAvailableCount();
        fleet.assignCourier();
        check("Courier assignment reduces availability",
                fleet.getAvailableCount() == before - 1);
    }

    private static void checkObserver() {
        Order order = new Order(
                "TEST-OBS",
                new Burger("Test Burger", 10.0));
        int[] updates = {0};
        order.addObserver(changedOrder -> updates[0]++);
        order.setStatus(OrderStatus.PLACED);
        check("Status change notifies observers",
                updates[0] == 1);
    }

    private static void checkFacade() throws Exception {
        Path temp = Files.createTempFile("orders", ".csv");
        Files.deleteIfExists(temp);

        Order order = new Order(
                "TEST-FACADE",
                new Burger("Test Burger", 10.0));
        OrderPlacementFacade facade =
                new OrderPlacementFacade(
                        FleetManager.getInstance(),
                        temp.toString());
        facade.placeOrder(order, new StandardDelivery());

        boolean saved = Files.exists(temp) &&
                Files.readString(temp).contains("TEST-FACADE");
        check("Facade completes and saves the order",
                order.getStatus() == OrderStatus.PLACED && saved);
        Files.deleteIfExists(temp);
    }

    private static void check(String name, boolean condition) {
        if (condition) {
            passed++;
            System.out.println("PASS - " + name);
        } else {
            failed++;
            System.out.println("FAIL - " + name);
        }
    }
}
