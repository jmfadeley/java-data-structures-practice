package patterns.decorator;

public class BurgerImpl implements Burger {

    @Override
    public String topWith() {
        return "Patty on a bun";
    }
}
