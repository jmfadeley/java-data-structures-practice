package patterns.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * Special orders upset us and break the API.
 */
@Slf4j
public class Waiter {
    HashMap<Integer, Customer> customers = new HashMap<>();

    public void welcomeCustomer(int tableNumber, Customer newCustomer) { 
        log.info("Welcome to our restaurant! Here's the menu!");
        customers.put(tableNumber, newCustomer);
    };

    // public void takeOrder() { }
    // public void submitOrder() { }
    // public void checkQuality() {

    // }

    /**
     * For simplicity, this handles both providing the bill, obtaining payment,
     * 
     * @param tableNumber
     */
    public void handleCheck(int tableNumber) {
        customers.remove(tableNumber);
    }
}
