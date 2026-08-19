import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<MenuItemData> menu =
                    CsvHelper.readMenu("data/menu.csv");

            ConsoleView view = new ConsoleView(scanner);
            OrderPlacementFacade facade =
                    new OrderPlacementFacade(
                            FleetManager.getInstance(),
                            "data/orders.csv");

            OrderController controller =
                    new OrderController(view, menu, facade);
            controller.start();
        } catch (IOException exception) {
            System.out.println(
                    "File error: " + exception.getMessage());
        }
    }
}
