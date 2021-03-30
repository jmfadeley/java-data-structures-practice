package patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import patterns.builder.lombok.Widget;
import patterns.builder.manual.*;
import patterns.observer.manual.*;
import patterns.observer.observable.ONewsAgency;
import patterns.observer.observable.ONewsChannel;

@DisplayName("Patterns test")
public class PatternsTest
 {
    
    @DisplayName("Test of builder pattern, manual approach.")
    @Test
    public void testBuilderManual() {
        User guy = new User.Builder("Rico", "Suavez").age(25).phone("555-555-5555").build();
        assertEquals("Suavez", guy.getLastName());
        assertEquals(25, guy.getAge());
    }

    @DisplayName("Test of builder pattern with Lombok's annotation.")
    @Test
    public void testBuilderLombok() {
        Widget widget = Widget.builder().name("robo").id(5).build();
        assertEquals("robo", widget.getName());
        assertEquals(5, widget.getId());
    }

    @DisplayName("Test of observer pattern, manual approach.")
    @Test
    public void testObserverManual() {
        Publisher observable = new Publisher();
        Reader observer = new Reader();

        observable.addObserver(observer);
        observable.setNews("book release");
        assertEquals("book release", observer.getNews());
    }

    @DisplayName("Test of observer pattern, using Java's Observable util.")
    @Test
    public void testObserverObservable() {
        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);
        observable.setNews("frank eats a dozen hotdogs");
        assertEquals("frank eats a dozen hotdogs", observer.getNews());
    }
}
