import java.io.IOException;

public final class MealFactory {
    private MealFactory() {
    }

    public static Meal createMeal(MenuItemData item) {
        // TODO 1: use item.getType() to create Burger,
        // Pizza, or Sushi. Reject unsupported types.
        switch (item.getType()) {
            case "BURGER":
                return new Burger(item.getName(), item.getPrice());
            case "PIZZA":
                return new Pizza(item.getName(), item.getPrice());
            case "SUSHI":
                return new Sushi(item.getName(), item.getPrice());

            default:
                throw new IllegalArgumentException();
        }
    }
}
