public class Sushi implements Meal {
    private final String name;
    private final double price;

    public Sushi(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
