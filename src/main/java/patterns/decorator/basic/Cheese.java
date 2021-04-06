package patterns.decorator.basic;

public class Cheese extends BurgerDecorator {
    private static final String TOPPING = " with cheese";

    public Cheese(Burger burger) {
        super(burger);
    }

    @Override
    public String topWith() {
        return super.topWith() + topWithLettuce();
    }

    public String topWithLettuce() {
        return TOPPING;
    }
}
