package patterns.decorator;

import lombok.Data;

@Data
public abstract class BurgerDecorator implements Burger {
    private Burger burger;

    protected BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String topWith() {
        return burger.topWith();
    }
}
