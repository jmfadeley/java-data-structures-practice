package patterns.decorator;

public class Tomatoes extends BurgerDecorator {
    private static final String TOPPING = " with tomatoes";

    public Tomatoes(Burger burger) {
        super(burger); // P:
    }

    @Override
    public String topWith() {
        return super.topWith() + topWithTomatoes();
    }

    public String topWithTomatoes() {
        return TOPPING;
    }
}
