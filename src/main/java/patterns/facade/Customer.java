package patterns.facade;

import java.util.EnumSet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Customer {
    boolean hasMenu = false;

    public void readMenu() {
        EnumSet<Ingredient> es = EnumSet.of(Ingredient.BEEF, Ingredient.LETTUCE);
        log.info(es.toString());
        log.info(MenuItem.CHEESEBURGER.toString());
    }

    public void transferMenu() {
        hasMenu = !hasMenu;
    }
}
