import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String orderId;
    private final Meal meal;
    private final List<OrderObserver> observers =
            new ArrayList<>();

    private String deliveryName = "Not selected";
    private double deliveryFee;
    private String courier = "Unassigned";
    private OrderStatus status = OrderStatus.NEW;

    public Order(String orderId, Meal meal) {
        this.orderId = orderId;
        this.meal = meal;
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void setDelivery(String name, double fee) {
        this.deliveryName = name;
        this.deliveryFee = fee;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
        // TODO 6: call update(this) on every observer.
    }

    public double getTotal() {
        return meal.getPrice() + deliveryFee;
    }

    public String toCsvLine() {
        return String.format(
                "%s,%s,%.2f,%s,%.2f,%s,%s,%.2f",
                orderId,
                meal.getDescription(),
                meal.getPrice(),
                deliveryName,
                deliveryFee,
                courier,
                status,
                getTotal());
    }

    public String getOrderId() {
        return orderId;
    }

    public Meal getMeal() {
        return meal;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public String getCourier() {
        return courier;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
