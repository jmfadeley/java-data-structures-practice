package patterns.decorator.basic;

/**
 * Truth be told, I'm not certain how useful decorators are given the preference for composition
 * instead of inheritence. But, I could be wrong.
 */
public class BurgerImpl implements Burger {

    @Override
    public String topWith() {
        return "Patty on a bun";
    }
}
