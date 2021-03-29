package structures;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sample Test")
public class SampleTest {
    
    @DisplayName("Basic test of Sample object.")
    @Test
    public void testSample() {
        Sample sample = new Sample(5, "Steven");
        assertEquals(5, sample.getNumber());
    }

    @DisplayName("Basic test for hashmap.")
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
}
