package structures;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Structures Test")
public class StructuresTest {
    
    @DisplayName("Basic test for HashMap.")
    @Test
    public void testHashMap() {
        // HashMaps cannot accept primitives. You can have one null key, but many null values.
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("England", "London");
        assertEquals("London", capitals.get("England"));

        HashMap<String, Sample> oops = new HashMap<>();
        oops.put("What", new Sample(1, "Huh"));
        assertEquals("Huh", oops.get("What").getName());
    }

    @DisplayName("Basic test for HashCode.")
    @Test
    public void testHashCode() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("guess", 1);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("guess", 1);

        assertEquals(map1, map2);
        assertEquals(map1.hashCode(), map2.hashCode());

        HashMap<String, Sample> oops1 = new HashMap<>();
        oops1.put("What", new Sample(1, "Huh"));

        HashMap<String, Sample> oops2 = new HashMap<>();
        oops2.put("What", new Sample(1, "Huh"));

        assertEquals(oops1, oops2);
        assertEquals(oops1.hashCode(), oops2.hashCode());
    }

    // TODO: Explain HashTables. 

    // TODO: Explain Hashing. https://www.educative.io/edpresso/what-is-hashing

    // TODO: Explain Binary Searching without libraries.
}
