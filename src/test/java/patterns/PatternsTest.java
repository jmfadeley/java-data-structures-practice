package patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import patterns.builder.lombok.Widget;
import patterns.builder.manual.*;
import patterns.decorator.basic.*;
import patterns.decorator.forwarding.InstrumentedSet;
import patterns.decorator.wrong.BadInstrumentedHashSet;
import patterns.factory.Pet;
import patterns.factory.data.breeds.Animal;
import patterns.factory.simple.*;
import patterns.observer.manual.*;
import patterns.observer.observable.*;
import patterns.observer.pcl.*;
import patterns.singleton.enumeration.EnumInstance;
import patterns.singleton.synced.SyncedInstance;
import patterns.singleton.unsafe.UnsafeInstance;

@DisplayName("Patterns testing.")
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

    @DisplayName("Decorator pattern, basic approach that implements new objects.")
    @Test
    public void testDecoratorBasic() { // This feels like a good thing to combine with a builder?
        Burger burger1 = new Tomatoes(new Lettuce(new BurgerImpl()));
        assertEquals("Patty on a bun with lettuce with tomatoes", burger1.topWith());

        Burger burger2 = new Cheese(new Cheese(new Lettuce(new BurgerImpl())));
        assertEquals("Patty on a bun with lettuce with cheese with cheese", burger2.topWith());
    }

    @DisplayName("Decorator pattern, forwarding approach that both wraps and extends functionality.")
    @Test
    public void testDecoratorForwarding() {
        InstrumentedSet<String> nameSet = new InstrumentedSet<>(new HashSet<>());
        nameSet.add("Tom");
        nameSet.addAll(Arrays.asList("Steve", "Marvin", "Marvin"));
        assertEquals(4, nameSet.getCount());
        nameSet.addAll(Arrays.asList("Steve", "Steve", "Steven"));
        assertEquals(7, nameSet.getCount());
        assertEquals(4, nameSet.size());

    }

    @DisplayName("Decorator pattern, wrong approach by design.")
    @Test
    public void testDecoratorWrong() {
        BadInstrumentedHashSet<String> nameSet = new BadInstrumentedHashSet<>();
        nameSet.add("Tom");
        assertEquals(1, nameSet.getAddCount());
        nameSet.addAll(Arrays.asList("Steve", "Marvin", "Andrew"));
        assertEquals(7, nameSet.getAddCount());
        nameSet.addAll(Arrays.asList("Ben", "Mark", "Carl"));
        assertEquals(13, nameSet.getAddCount());
        assertEquals(7, nameSet.size());
        nameSet.add("Tom");
        assertEquals(14, nameSet.getAddCount());
        assertEquals(7, nameSet.size());
    }

    @DisplayName("Factory pattern, simple factory.")
    @Test // See for more: https://stackoverflow.com/questions/5739611/what-are-the-differences-between-abstract-factory-and-factory-design-patterns
    public void testFactory() { 
        Pet beagle = new Pet("Fred", 10, DogFactory.create("Beagle"));
        assertEquals(15, beagle.getBreed().getMaxLifeSpan());
        Animal dog = (Animal) DogFactory.create("German Shepherd");
        assertEquals(9, dog.getMinLifeSpan());
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
        observable.setNews("Film at 11. Die Hard.");
        assertEquals("Film at 11. Die Hard.", observer.getNews());
    }

    @DisplayName("Singleton pattern, not thread-safe instance.")
    @Test
    public void testSingletonUnsafeInstance() {
        UnsafeInstance instance1 = UnsafeInstance.getInstance();
        assertEquals(1, instance1.getTimesInitialized());

        UnsafeInstance instance2 = UnsafeInstance.getInstance();
        assertEquals(2, instance1.getTimesInitialized());
        assertEquals(2, instance2.getTimesInitialized());
    }

    @DisplayName("Singleton pattern, thread-safe enum instance.")
    @Test
    public void testSingletonEnumInstance() {
        EnumInstance instance1 = EnumInstance.INSTANCE.getInstance();
        assertEquals("My twin was delicious", instance1.getInfo());

        EnumInstance instance2 = EnumInstance.INSTANCE.getInstance();
        instance2.setInfo("Woot"); 

        assertEquals("Woot", instance1.getInfo());
        assertEquals("Woot", instance2.getInfo());
    }

    // TODO: Rewrite this to actually use threads.
    @DisplayName("Singleton pattern, thread-safe synchronized instance.")
    @Test
    public void testSingletonSyncInstance() {
        SyncedInstance instance1 = SyncedInstance.getInstance();
        assertEquals("My twin was delicious", instance1.getInfo());

        SyncedInstance instance2 = SyncedInstance.getInstance();
        instance2.setInfo("Woot"); 

        assertEquals("Woot", instance1.getInfo());
        assertEquals("Woot", instance2.getInfo());
    }

    // TODO: Figure out Abstract Factory pattern and place here.

    // TODO: Figure out Facade pattern and place here.
}
