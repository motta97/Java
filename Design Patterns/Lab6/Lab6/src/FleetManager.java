import java.util.ArrayList;
import java.util.List;

public final class FleetManager {
    private static FleetManager instance;
    private final List<String> availableCouriers =
            new ArrayList<>(List.of(
                    "Courier-1", "Courier-2"));

    private FleetManager() {
    }

    public static FleetManager getInstance() {
        // TODO 4: return the same instance every time.
        if(instance == null) {
            instance = new FleetManager();
        }
        return instance;
    }

    public String assignCourier() {
        // TODO 5: remove and return one courier.
        if (availableCouriers.isEmpty()) {
            throw new IllegalStateException(
                    "No courier is currently available.");
        }
        String courier = availableCouriers.get(0);
        availableCouriers.remove(courier);
        return courier;
    }

    public int getAvailableCount() {
        return availableCouriers.size();
    }
}
