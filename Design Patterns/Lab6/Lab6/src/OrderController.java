import java.io.IOException;
import java.util.List;

public class OrderController {
    private final ConsoleView view;
    private final List<MenuItemData> menu;
    private final OrderPlacementFacade facade;

    public OrderController(ConsoleView view,
                           List<MenuItemData> menu,
                           OrderPlacementFacade facade) {
        this.view = view;
        this.menu = menu;
        this.facade = facade;
    }

    public void start() {
        view.displayTitle();
        view.displayMenu(menu);

        int mealChoice = view.readMealChoice(menu.size());
        MenuItemData selected = menu.get(mealChoice - 1);
        Meal meal = MealFactory.createMeal(selected);

        if (view.askYesNo("Add Extra Cheese?")) {
            meal = new ExtraCheese(meal);
        }
        if (view.askYesNo("Add Combo Side?")) {
            meal = new ComboSide(meal);
        }

        view.displayDeliveryOptions();
        int deliveryChoice = view.readDeliveryChoice();
        DeliveryStrategy strategy = deliveryChoice == 1
                ? new StandardDelivery()
                : new ExpressDelivery();

        Order order = new Order(
                "ORD-" + System.currentTimeMillis(), meal);
        order.addObserver(new KitchenDisplay());
        order.addObserver(new CustomerNotifier());
        // TODO 8: register CustomerNotifier, call the Facade,
        // and ask the View to display the completed order.
        try {
            facade.placeOrder(order, strategy);
            view.displayOrder(order);
        } catch (IOException | IllegalStateException exception) {
            view.showError(exception.getMessage());
        }
    }
}
