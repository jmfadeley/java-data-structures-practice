package patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import patterns.builder.lombok.Widget;
import patterns.builder.manual.*;
import patterns.observer.manual.*;
import patterns.observer.observable.*;
import patterns.observer.pcl.*;

@DisplayName("Patterns test")
public class PatternsTest
 {
    
    @DisplayName("Builder pattern, manual approach.")
    @Test
    public void testBuilderManual() {
        User guy = new User.Builder("Rico", "Suavez").age(25).phone("555-555-5555").build();
        assertEquals("Suavez", guy.getLastName());
        assertEquals(25, guy.getAge());
    }

    @DisplayName("Builder pattern, Lombok's annotation.")
    @Test
    public void testBuilderLombok() {
        Widget widget = Widget.builder().name("robo").id(5).build();
        assertEquals("robo", widget.getName());
        assertEquals(5, widget.getId());
    }

    @DisplayName("Observer pattern, manual approach.")
    @Test
    public void testObserverManual() {
        Publisher observable = new Publisher();
        Reader observer = new Reader();

        observable.addObserver(observer);
        observable.setNews("book release");
        assertEquals("book release", observer.getNews());
    }

    @DisplayName("Observer pattern, Java's Observable. Note: Deprecated since Java 9.")
    @Test
    public void testObserverObservable() {
        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);
        observable.setNews("frank eats a dozen hotdogs");
        assertEquals("frank eats a dozen hotdogs", observer.getNews());
    }

    @DisplayName("Observer pattern, PropertyChangeSupport & PropertyChangeListener.")
    @Test
    public void testObserverPropertyChange() {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.setNews("film at 11. Die Hard.");
        assertEquals("film at 11. Die Hard.", observer.getNews());
    }
}
