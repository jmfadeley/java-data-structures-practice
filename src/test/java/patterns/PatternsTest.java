package patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import patterns.builder.manual.*;
import patterns.observer.manual.*;

@DisplayName("Patterns test")
public class PatternsTest
 {
    
    @DisplayName("Test of builder pattern, manual approach.")
    @Test
    public void testBuilder() {
        User guy = new UserBuilder("Rico", "Suavez").setAge(25).setPhone("555-555-5555").build();
        assertEquals("Suavez", guy.getLastName());
        assertEquals(25, guy.getAge());
    }

    @DisplayName("Test of observer pattern, manual approach.")
    @Test
    public void testObserver() {
        Publisher observable = new Publisher();
        Reader observer = new Reader();

        observable.addObserver(observer);
        observable.setNews("book release");
        assertEquals("book release", observer.getNews());
    }
}
