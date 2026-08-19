import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public final class CsvHelper {
    private static final String ORDER_HEADER =
            "orderId,meal,mealPrice,delivery,deliveryFee," +
            "courier,status,total";

    private CsvHelper() {
    }

    public static List<MenuItemData> readMenu(String fileName)
            throws IOException {
        List<String> lines = Files.readAllLines(Path.of(fileName));
        List<MenuItemData> menu = new ArrayList<>();

        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            if (line.isEmpty()) {
                continue;
            }

            String[] values = line.split(",");
            if (values.length != 4) {
                throw new IOException(
                        "Invalid menu row at line " + (i + 1));
            }

            try {
                menu.add(new MenuItemData(
                        values[0].trim(),
                        values[1].trim(),
                        values[2].trim(),
                        Double.parseDouble(values[3].trim())));
            } catch (NumberFormatException exception) {
                throw new IOException(
                        "Invalid price at line " + (i + 1),
                        exception);
            }
        }
        return menu;
    }

    public static void appendOrder(String fileName, Order order)
            throws IOException {
        Path path = Path.of(fileName);
        if (path.getParent() != null) {
            Files.createDirectories(path.getParent());
        }

        if (Files.notExists(path) || Files.size(path) == 0) {
            Files.writeString(
                    path,
                    ORDER_HEADER + System.lineSeparator(),
                    StandardOpenOption.CREATE);
        }

        Files.writeString(
                path,
                order.toCsvLine() + System.lineSeparator(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
}
