public abstract class MealDecorator implements Meal {
    protected final Meal meal;

    protected MealDecorator(Meal meal) {
        if (meal == null) {
            throw new IllegalArgumentException(
                    "Wrapped meal cannot be null.");
        }
        this.meal = meal;
    }
}
