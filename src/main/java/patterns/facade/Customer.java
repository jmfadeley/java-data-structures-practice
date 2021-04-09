package patterns.facade;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Customer {
    boolean hasMenu = false;
    MenuItem order;

    public void readMenu() {
        log.info("CHECK!");
        // log.info(Arrays.toString(MenuItem.class.getEnumConstants()));
    }

    public void transferMenu() {
        hasMenu = !hasMenu;
    }
}
