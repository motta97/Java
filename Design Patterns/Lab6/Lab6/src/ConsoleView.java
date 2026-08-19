import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayTitle() {
        System.out.println("=== CAMPUS FOOD DELIVERY ===");
    }

    public void displayMenu(List<MenuItemData> menu) {
        System.out.println("\nAvailable meals:");
        for (int i = 0; i < menu.size(); i++) {
            MenuItemData item = menu.get(i);
            System.out.printf("%d. %-24s %6.2f EGP%n",
                    i + 1, item.getName(), item.getPrice());
        }
    }

    public int readMealChoice(int menuSize) {
        return readChoice("Choose a meal: ", 1, menuSize);
    }

    public boolean askYesNo(String prompt) {
        while (true) {
            System.out.print(prompt + " (y/n): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("y")) {
                return true;
            }
            if (input.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Enter y or n.");
        }
    }

    public void displayDeliveryOptions() {
        System.out.println("\nDelivery methods:");
        System.out.println("1. Standard Delivery - 15.00 EGP");
        System.out.println("2. Express Delivery  - 30.00 EGP");
    }

    public int readDeliveryChoice() {
        return readChoice("Choose delivery: ", 1, 2);
    }

    public void displayOrder(Order order) {
        System.out.println("\nOrder completed:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Meal: " + order.getMeal().getDescription());
        System.out.printf("Meal price: %.2f EGP%n",
                order.getMeal().getPrice());
        System.out.println("Delivery: " + order.getDeliveryName());
        System.out.printf("Delivery fee: %.2f EGP%n",
                order.getDeliveryFee());
        System.out.println("Courier: " + order.getCourier());
        System.out.println("Status: " + order.getStatus());
        System.out.printf("Total: %.2f EGP%n", order.getTotal());
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
    }

    private int readChoice(String prompt, int minimum,
                           int maximum) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                int choice = Integer.parseInt(input);
                if (choice >= minimum && choice <= maximum) {
                    return choice;
                }
            } catch (NumberFormatException ignored) {
                // Validation message is printed below.
            }
            System.out.printf("Enter a number from %d to %d.%n",
                    minimum, maximum);
        }
    }
}
