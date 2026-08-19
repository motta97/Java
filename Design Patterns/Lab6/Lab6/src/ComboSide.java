public class ComboSide extends MealDecorator {
    public ComboSide(Meal meal) {
        super(meal);
    }

    @Override
    public String getDescription() {
        // TODO 2: add " + Combo Side" after delegation.
        return meal.getDescription()+ "ComboSide";
    }

    @Override
    public double getPrice() {
        // TODO 2: add 25.00 EGP after delegation.
        return meal.getPrice()+ 25;
    }
}
