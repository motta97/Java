public class MenuItemData {
    private final String code;
    private final String type;
    private final String name;
    private final double price;

    public MenuItemData(String code, String type,
                        String name, double price) {
        this.code = code;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
