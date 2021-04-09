package patterns.facade;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Customer {
    boolean hasMenu = false;
    MenuItem order;

    public void readMenu() {
        log.info(MenuItem.CHEESEBURGER.toString());
        // log.info(Ingredient.ONION.toString());
    }

    public void transferMenu() {
        hasMenu = !hasMenu;
    }
}
