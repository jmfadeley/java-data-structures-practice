package patterns.decorator.basic;

public class Lettuce extends BurgerDecorator {
    private static final String TOPPING = " with lettuce";

    public Lettuce(Burger burger) {
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
